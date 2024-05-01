/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beana
 */
public class NumException extends Exception {
    public NumException(String msg) {
        super(msg);
    }
    public void impMsg() {
        System.out.println("ERRO: não pode haver número negativo para conta!");
    }
}
