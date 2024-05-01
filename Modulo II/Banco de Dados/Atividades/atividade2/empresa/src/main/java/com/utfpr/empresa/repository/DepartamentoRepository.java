package com.utfpr.empresa.repository;

import com.utfpr.empresa.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    Departamento findFirstByIdOrderByIdAsc(Long id);
}
