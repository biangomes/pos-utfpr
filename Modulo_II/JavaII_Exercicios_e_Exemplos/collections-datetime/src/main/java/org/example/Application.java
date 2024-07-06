package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
  public Application() {
    test();
  }

  private void test() {
    final var employees = createEmployees();

    // NAO-FUNCIONAL

    // retorna todos os funcionarios
//    for (Employee ep : employees) {
//      System.out.println(ep);
//    }

    // todos os funcionarios do dpto de Faturamento
//    for (Employee ep : employees) {
//      if (ep.departamento().equals("Faturamento")) {
//        System.out.println(ep);
//      }
//    }

    // contar os funcionarios que trabalham no Faturamento
//    final var total = employees.stream()
//        .filter(ep -> ep.departamento().equals("Faturamento"))
//        .count();
//    System.out.printf("Pessoas no faturamento %s", total).println();

    // Somatoria do salario de todo mundo que trabalha no RH
//    final var totalRh = employees.stream()  // pegando todos os salarios
//        .filter(ep -> ep.departamento().equals("RH"))
//        .map(Employee::getSalario)    // mapeando os salarios deles
//        .reduce(BigDecimal.ZERO, BigDecimal::add);    // caso a soma (seg. parametro) der "problema", será retornado zero
//
//    System.out.printf("Salario total RH: R$%s", totalRh).println();

    // Existe algum funcionario que trabalha na Contabilidade?
//    final var hasAnyEmployeeFromContabilidade = employees.stream().anyMatch(ep -> ep.getDepartamento().equals("Contabilidade"));
//    System.out.printf("Existe alguém que trabalha na Contabilidade: %b", hasAnyEmployeeFromContabilidade).println();
//
//
//    // TODOS os funcionarios trabalham na Contabilidade?
//    final var areAllEmployeesFromContabilidade = employees.stream().allMatch(ep -> ep.getDepartamento().equals("Contabilidade"));
//    System.out.printf("Todos trabalham na Contabilidade: %b", areAllEmployeesFromContabilidade).println();


    // Criar uma lista a partir de um filtro
//    final var employeesFromContabilidade = employees.stream()
//        .filter(ep -> ep.getDepartamento().equals("Contabilidade"))
//        .collect(Collectors.toList());
//    System.out.println(employeesFromContabilidade);

    // Considerando dados REPETIDOS, pegar APENAS um
//    final var justOneShion = employees.stream()
//        .filter(ep -> ep.getNome().equals("Shion"))
//        .distinct()
//        .count();
//    System.out.println(justOneShion);

    // Ordenação de objetos
//    employees.stream()
//             .sorted(Comparator.comparing(Employee::getSalario).reversed())
//        .forEach(System.out::println);

    // Ordenação de objetos ALTERANDO a lista em si
//    employees.sort(Comparator.comparing(Employee::getSalario).reversed());

    // Usando LIMIT
//    final var justTwoFromRh = employees.stream()
//        .filter(ep -> ep.getDepartamento().equals("RH"))
//        .limit(2)
//        .collect(Collectors.toList());
//    justTwoFromRh.forEach(System.out::println);

//    final var totalPaycheckFromRh = employees.stream()
//             .filter(ep -> ep.getDepartamento().equals("RH"))
//             .peek(System.out::println)
//             .map(Employee::getSalario)
//             .reduce(BigDecimal.ZERO, BigDecimal::add);
//    System.out.println(totalPaycheckFromRh);
//    System.out.println("------------------------------------------------");
//    employees.stream().findFirst().ifPresent(System.out::println);

    employees.stream().findFirst().ifPresent(System.out::println);


    // =================================================================

    // FUNCIONAL
//    employees.forEach(System.out::println); // method reference

    // todos os funcionarios do dpto de Faturamento
//    employees.stream()    // cria uma stream
//             .filter(ep -> ep.departamento().equals("Faturamento")) // atraves da arrow function, busca os employees de Faturamento
//             .forEach(System.out::println);   // permite imprimir os resultados filtrados acima

  }

  private List<Employee> createEmployees() {
    final List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("Golu", LocalDate.of(1989, 1, 11), new BigDecimal(1500), "Faturamento"));
    employees.add(new Employee("Vegeta", LocalDate.of(1988, 3, 15), new BigDecimal(1500), "Contabilidade"));
    employees.add(new Employee("Naruto", LocalDate.of(1987, 5, 12), new BigDecimal(7000), "RH"));
    employees.add(new Employee("Saori", LocalDate.of(1986, 10, 10), new BigDecimal(1500), "RH"));
    employees.add(new Employee("Miro", LocalDate.of(1985, 12, 1), new BigDecimal(2000), "Faturamento"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));

    return employees;
  }

  public static void main(String args[]) {
    new Application();
  }
}
