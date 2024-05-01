package com.utfpr.backendcategoriamusicawebconf.service;

import com.utfpr.backendcategoriamusicawebconf.entity.Musica;
import com.utfpr.backendcategoriamusicawebconf.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository repository;

    public List<Musica> listar() {
        return repository.findAll();
    }
}
