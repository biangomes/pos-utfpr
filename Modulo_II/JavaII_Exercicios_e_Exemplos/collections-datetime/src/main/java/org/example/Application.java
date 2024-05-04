package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    // =================================================================

    // FUNCIONAL
//    employees.forEach(System.out::println); // method reference

    // todos os funcionarios do dpto de Faturamento
    employees.stream()    // cria uma stream
             .filter(ep -> ep.departamento().equals("Faturamento")) // atraves da arrow function, busca os employees de Faturamento
             .forEach(System.out::println);   // permite imprimir os resultados filtrados acima

  }

  private List<Employee> createEmployees() {
    final List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("Golu", LocalDate.of(1989, 1, 11), new BigDecimal(1500), "Faturamento"));
    employees.add(new Employee("Vegeta", LocalDate.of(1988, 3, 15), new BigDecimal(1500), "Contabilidade"));
    employees.add(new Employee("Naruto", LocalDate.of(1987, 5, 12), new BigDecimal(7000), "RH"));
    employees.add(new Employee("Saori", LocalDate.of(1986, 10, 10), new BigDecimal(1500), "RH"));
    employees.add(new Employee("Miro", LocalDate.of(1985, 12, 1), new BigDecimal(2000), "Faturamento"));
    employees.add(new Employee("Shion", LocalDate.of(1984, 12, 14), new BigDecimal(2500), "Contabilidade"));

    return employees;
  }

  public static void main(String args[]) {
    new Application();
  }
}
