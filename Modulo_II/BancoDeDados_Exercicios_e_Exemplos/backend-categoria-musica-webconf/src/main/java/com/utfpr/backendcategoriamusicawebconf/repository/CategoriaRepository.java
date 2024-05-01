package com.utfpr.backendcategoriamusicawebconf.repository;

import com.utfpr.backendcategoriamusicawebconf.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
