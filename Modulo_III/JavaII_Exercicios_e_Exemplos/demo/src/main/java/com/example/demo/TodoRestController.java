package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TodoRestController {
  private final TodoRepository repository;

  public TodoRestController(final TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Flux<Todo> lerTodos() {
    return repository.findAll();
  }
}
