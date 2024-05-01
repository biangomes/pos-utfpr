package com.beatriz.sistemabancario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beana
 */
public abstract class ClienteBanco implements Verifica {
    private int numeroConta;
    private String nome;
    private Endereco ender;
    
    
    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        }
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEnder(Endereco ender) {
        this.ender = ender;
    }
    
    public int getNumeroConta() {
        return this.numeroConta;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Endereco getEndereco() {
        return this.ender;
    }
    
    public abstract void verifDoc();
}
