package com.beatriz.sistemabancario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beana
 */
public class PessoaFisica extends ClienteBanco {
    private int cpf;
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public int getCpf() {
        return this.cpf;
    }

    @Override
    public void verifDoc() {
        if (this.cpf < 10 || this.cpf > 20) {
            System.out.println("CPF invalido.");
        }
        System.out.println("CPF valido.");
    }

    @Override
    public void validar() {
        if (getNumeroConta() % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
