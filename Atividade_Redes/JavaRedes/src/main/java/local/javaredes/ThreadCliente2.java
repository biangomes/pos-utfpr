/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.javaredes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Beatriz Nascimento Gomes
 */
public class ThreadCliente2 extends Thread {
    private String nome;
    private int idade;
    private JTextArea jTArea;
    
    private DatagramSocket conexao;
    private DatagramPacket datagrama;
    private ByteArrayOutputStream saidaStream;
    private ObjectOutputStream saida;
    
    public ThreadCliente2(String nome, int idade, JTextArea jTArea) {
        this.nome = nome;
        this.idade = idade;
        this.jTArea = jTArea;
    }
    
        @Override
    public void run() {
        try {
            conexao = new DatagramSocket();
            Pessoa p = new Pessoa();
            p.setNome(nome);
            p.setIdade(idade);
            
            saidaStream = new ByteArrayOutputStream();
            saida = new ObjectOutputStream(saidaStream);
            saida.writeObject(p);
            
            byte[] dados = saidaStream.toByteArray();
            DatagramPacket pacoteEnviado = new DatagramPacket(
                    dados, 
                    dados.length,
                    InetAddress.getByName("127.0.0.1"), 
                    50000);
            conexao.send(pacoteEnviado);
            
            datagrama = new DatagramPacket(new byte[120], 120);
            conexao.receive(datagrama);
            String respostaServidor = new String(datagrama.getData());
            
            jTArea.append(respostaServidor + "\n");
        } catch (SocketException e) {
            Logger.getLogger(ThreadCliente1.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(ThreadCliente1.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
