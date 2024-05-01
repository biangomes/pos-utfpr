package com.utfpr.backendcategoriamusicawebconf.service;

import com.utfpr.backendcategoriamusicawebconf.entity.Categoria;
import com.utfpr.backendcategoriamusicawebconf.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listarTodasCategorias() {
        return repository.findAll();
    }
}
