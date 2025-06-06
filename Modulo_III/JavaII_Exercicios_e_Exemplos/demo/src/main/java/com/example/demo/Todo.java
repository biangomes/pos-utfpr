package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Todo(String id, String titulo, String descricao, boolean feito) {

  public Todo {
    if (titulo == null || titulo.length() < 3) {
      throw new IllegalArgumentException("Título deve ser maior que 3 caracteres");
    }
  }
}
