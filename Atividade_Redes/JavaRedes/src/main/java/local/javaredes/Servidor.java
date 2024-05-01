package local.javaredes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beatriz Nascimento Gomes
 */
public class Servidor {
    private static DatagramSocket conexao;
    private static DatagramPacket datagrama;
    
    private static ByteArrayInputStream entradaStream;
    private static ObjectInputStream entrada;
    
    public static void main(String[] args) {
        try {
            conexao = new DatagramSocket(50000);
            
            while (true) {
                System.out.println("Aguardando requisicoes...");
                datagrama = new DatagramPacket(new byte[1024], 1024);
                conexao.receive(datagrama);
                
                entradaStream = new ByteArrayInputStream(datagrama.getData());
                entrada = new ObjectInputStream(entradaStream);
                Pessoa p = (Pessoa) entrada.readObject();
                System.out.println("Objeto Pessoa recebido do cliente\n\tNome: " +
                        p.getNome() +
                        "\n\tIdade: " +
                        p.getIdade() +
                        "\n");
                
                byte[] resposta = "Recebeu do servidor\nDados recebidos corretamente!".getBytes();
                
                datagrama = new DatagramPacket(resposta, resposta.length,
                        datagrama.getAddress(), datagrama.getPort());
                
//                tempo();
                conexao.send(datagrama);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
