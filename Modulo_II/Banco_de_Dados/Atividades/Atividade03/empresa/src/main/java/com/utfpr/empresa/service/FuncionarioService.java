package com.utfpr.empresa.service;

import com.utfpr.empresa.entity.Funcionario;
import com.utfpr.empresa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepository repository;

    @Autowired
    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public Funcionario listaPorNomeEQtdDependente(String nome, int qtdDependente) {
        return repository.findByNomeAndQtdDependentes(nome, qtdDependente);
    }

    public List<Funcionario> listaPorDepartamento(int codDepartamento) {
        List<Funcionario> resultados = repository.buscaPorDepartamento(codDepartamento);
        return resultados;
    }

    public Funcionario listaFuncionarioComMaiorSalario() {
        return repository.findFirstFuncionarioBySalario();
    }

    public List<Funcionario> listaTresFuncionariosMaioresSalarios() {
        List<Funcionario> resultados = repository.findTop3FuncionariosBySalarioOrderBySalarioDesc();
        return resultados;
    }

    public List<Funcionario> listaFuncionariosSemDependentes() {
        List<Funcionario> resultados = repository.findFuncionariosSemDependentes();
        return resultados;
    }

    public List<Funcionario> listaFuncionariosComSalarioMaiorQue(BigDecimal salario) {
        List<Funcionario> resultados = repository.findFuncionariosBySalarioGreaterThan(salario);
        return resultados;
    }

    public List<Funcionario> listaFuncionariosComSalarioMaiorQueJpql(BigDecimal salario) {
        List<Funcionario> resultados = repository.findFuncionariosBySalarioGreaterThanUsingJpql(salario);
        return resultados;
    }

    public List<Funcionario> listaFuncionariosPorDependentes(int qtdDependentes) {
        List<Funcionario> resultados = repository.findFuncionariosPorDependente(qtdDependentes);
        return resultados;
    }

    public List<Funcionario> listaFuncionariosComCaracteresNoNome(String caracteres) {
        List<Funcionario> resultados = repository.findFuncionariosQueTenhamPalavrasNoNome(caracteres);
        return resultados;
    }
}
