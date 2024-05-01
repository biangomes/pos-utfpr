package com.utfpr.backendcategoriamusicawebconf.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_categoria", nullable = false)
    private Long id;

    private Integer duracao;

    @Column(length = 100)
    private String titulo;

    @ManyToOne      // muitas musicas vao ter uma categoria
    @JoinColumn(name = "fk_categoria", nullable = false)
    private Categoria categoria;
}
