package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {
  Flux<Todo> findByFeito(boolean feito);
}
