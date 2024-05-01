package com.utfpr.empresa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@NamedQuery(name = "Funcionario.findFuncionariosPorDependente",
            query = "SELECT f FROM Funcionario f WHERE f.qtdDependentes > :qtdDependentes")
@NamedNativeQuery(name = "Funcionario.findFuncionariosQueTenhamPalavrasNoNome",
            query = "SELECT * FROM funcionario WHERE nome LIKE '%:caracteres%'",
            resultClass = Funcionario.class)
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codFuncionario", nullable = false)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "qtdDependentes")
    private Integer qtdDependentes;
    private BigDecimal salario;
    private String cargo;
    @ManyToOne
    @JoinColumn(name = "departamento_fk", nullable = false)
    private Departamento departamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(Integer qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
