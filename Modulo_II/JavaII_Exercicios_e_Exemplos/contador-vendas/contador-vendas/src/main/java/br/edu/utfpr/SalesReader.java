package br.edu.utfpr;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SalesReader {

    private final List<Sale> sales;

    public SalesReader(String salesFile) {

        final var dataStream = ClassLoader.getSystemResourceAsStream(salesFile);

        if (dataStream == null) {
            throw new IllegalStateException("File not found or is empty");
        }

        final var builder = new CsvToBeanBuilder<Sale>(new InputStreamReader(dataStream, StandardCharsets.UTF_8));

        sales = builder
                .withType(Sale.class)
                .withSeparator(';')
                .build()
                .parse();
    }

    public BigDecimal totalOfCompletedSales() {
        final BigDecimal total = sales.stream()
                .filter(statusSales -> statusSales.isCompleted())
                .map(Sale::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return total;
    }

    public BigDecimal totalOfCancelledSales() {
        final BigDecimal total = sales.stream()
                .filter(statusSales -> statusSales.isCancelled())
                .map(Sale::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return total;
    }

    public Optional<Sale> mostRecentCompletedSale() {
        final Optional<Sale> result = sales.stream()
                .sorted(Comparator.comparing(Sale::getSaleDate).reversed())
                .filter(statusSale -> statusSale.isCompleted())
                .findFirst();
        return result;
    }

    public long daysBetweenFirstAndLastCancelledSale() {
        return 0;
    }

    public BigDecimal totalCompletedSalesBySeller(String sellerName) {
        final BigDecimal result = sales.stream()
                .filter(sale -> sale.getSeller().equals(sellerName) && sale.isCompleted())
                .map(Sale::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return result;
    }

    public long countAllSalesByManager(String managerName) {
        final long result = sales.stream()
                .filter(sale -> sale.getManager().equals(managerName))
                .count();
        return result;
    }

    public BigDecimal totalSalesByStatusAndMonth(Sale.Status status, Month... months) {
        final BigDecimal result = sales.stream()
                .filter(sale -> sale.getStatus() == status && Arrays.asList(months).contains(sale.getSaleDate().getMonth()))
                .map(Sale::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return result;
    }

    public Map<String, Long> countCompletedSalesByDepartment() {
        return sales.stream()
                .filter(sale -> sale.getStatus() == Sale.Status.COMPLETED)
                .collect(Collectors.groupingBy(Sale::getDepartment, Collectors.counting()));
    }

    public Map<Integer, Map<String, Long>> countCompletedSalesByPaymentMethodAndGroupingByYear() {
        return sales.stream()
                .filter(sale -> sale.getStatus() == Sale.Status.COMPLETED)
                .collect(Collectors.groupingBy(sale -> sale.getSaleDate().getYear(),
                        Collectors.groupingBy(Sale::getPaymentMethod, Collectors.counting())));
    }

    public Map<String, BigDecimal> top3BestSellers() {
        final var topSellers = sales.stream()
                .sorted(Comparator.comparing(Sale::getValue).reversed())
                .limit(3)
                .collect(Collectors.toMap(Sale::getSeller, Sale::getValue));
        return topSellers;
    }

    public Map<String, BigDecimal> worst3Sellers() {
        final var result = sales.stream()
                .sorted(Comparator.comparing(Sale::getValue))
                .limit(3)
                .collect(Collectors.toMap(Sale::getSeller, Sale::getValue));
        return result;
    }

    public BigDecimal calculateFilteredSalesTotal() {
        BigDecimal filteredSalesTotal = sales.stream()
                .filter(sale -> sale.isCompleted() && sale.getEstate().equals("Paraná") && isDesiredMonth(String.valueOf(sale.getSaleDate().getMonth())))
                .map(Sale::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return filteredSalesTotal;
    }

    private boolean isDesiredMonth(String month) {
        return month.equals("Janeiro") || month.equals("Junho") || month.equals("Dezembro");
    }

    public long countSalesByRosangelaAlmeidaBetweenDates() {
        LocalDate startDate = LocalDate.of(2012, 5, 12);
        LocalDate endDate = LocalDate.of(2012, 7, 29);

        long totalSales = sales.stream()
                .filter(sale -> sale.getSeller().equals("Rosângela Almeida")) // Filtra vendas da vendedora Rosângela Almeida
                .filter(sale -> sale.getSaleDate().isAfter(startDate) && sale.getSaleDate().isBefore(endDate)) // Filtra vendas dentro do intervalo de datas
                .count(); // Conta o número total de vendas após aplicar os filtros

        return totalSales;
    }

    public Set<Integer> findYearsWithSalesValue(BigDecimal targetValue) {
        Set<Integer> yearsWithTargetSales = sales.stream()
                .filter(sale -> sale.getValue().compareTo(targetValue) == 0) // Filtra vendas com o valor especificado
                .map(sale -> sale.getSaleDate().getYear()) // Extrai o ano de cada venda
                .collect(Collectors.toSet()); // Coleta os anos em um conjunto para eliminar duplicatas

        return yearsWithTargetSales;
    }

    public String findManagerWithMostCancellations() {
        Map<String, Long> cancellationsByManager = sales.stream()
                .filter(sale -> sale.getSaleDate().getYear() >= 2013 && sale.getSaleDate().getYear() <= 2014) // Filtra vendas entre 2013 e 2014
                .filter(Sale::isCancelled) // Filtra vendas canceladas
                .collect(Collectors.groupingBy(Sale::getManager, Collectors.counting())); // Agrupa vendas canceladas por gerente

        // Encontra o gerente com mais cancelamentos
        String managerWithMostCancellations = cancellationsByManager.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum gerente encontrado");

        return managerWithMostCancellations;
    }
}
