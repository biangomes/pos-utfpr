package com.utfpr.empresa.service;

import com.utfpr.empresa.entity.Departamento;
import com.utfpr.empresa.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
    private final DepartamentoRepository repository;

    @Autowired
    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public Departamento listaPrimeiroDepartamentoCadastrado(Long id) {
        return repository.findFirstByIdOrderByIdAsc(id);
    }
}
