/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beana
 */
public class PessoaJuridica extends ClienteBanco {
    private int cnpj;
    private PessoaFisica responsavel = new PessoaFisica();

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    public int getCnpj() {
        return this.cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    @Override
    public void verifDoc() {
        if (this.responsavel.getNome().length() > 30) {
            System.out.println("Nome invalido para responsavel");
        }
        System.out.println("Nome valido para responsavel");
    }

    @Override
    public void validar() {
        if (responsavel.getNumeroConta() % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
