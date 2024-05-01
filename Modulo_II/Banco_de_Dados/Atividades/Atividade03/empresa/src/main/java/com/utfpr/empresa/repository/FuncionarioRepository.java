package com.utfpr.empresa.repository;

import com.utfpr.empresa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario findByNomeAndQtdDependentes(String name, int qtdDependentes);

    @Query("SELECT f FROM Funcionario f WHERE f.departamento = :codDepartamento")
    List<Funcionario> buscaPorDepartamento(int codDepartamento);

    @Query("SELECT f FROM Funcionario f ORDER BY f.salario DESC")
    Funcionario findFirstFuncionarioBySalario();

    @Query("SELECT f FROM Funcionario f ORDER BY f.salario DESC")
    List<Funcionario> findTop3FuncionariosBySalarioOrderBySalarioDesc();

    @Query("SELECT f FROM Funcionario f WHERE f.qtdDependentes = 0 ORDER BY f.nome ASC")
    List<Funcionario> findFuncionariosSemDependentes();

    @Query("SELECT f FROM Funcionario f WHERE f.salario > :salario")
    List<Funcionario> findFuncionariosBySalarioGreaterThan(BigDecimal salario);

    @Query(value = "SELECT * FROM funcionario WHERE salario > :salario",
            nativeQuery = true)
    List<Funcionario> findFuncionariosBySalarioGreaterThanUsingJpql(BigDecimal salario);

    List<Funcionario> findFuncionariosPorDependente(int qtdDependentes);

    List<Funcionario> findFuncionariosQueTenhamPalavrasNoNome(String caracteres);
}
