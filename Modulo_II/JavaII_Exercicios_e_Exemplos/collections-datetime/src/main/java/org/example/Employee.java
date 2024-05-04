package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Employee(String nome, LocalDate dataNascimento, BigDecimal salario, String departamento) {
  public String nome() {
    return nome;
  }

  public LocalDate dataNascimento() {
    return dataNascimento;
  }

  public BigDecimal salario() {
    return salario;
  }

  public String departamento() {
    return departamento;
  }
}
