package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Employee(String nome, LocalDate dataNascimento, BigDecimal salario, String departamento) {
  public String getNome() {
    return nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public String getDepartamento() {
    return departamento;
  }
}
