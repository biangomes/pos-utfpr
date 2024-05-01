package dominio;

import dominio.Carga;
import dominio.Passeio;
import exception.VelocException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    InputStreamReader entradaDeDados = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(entradaDeDados);

    public String entDados(String tipoDeVeiculo) throws IOException, VelocException {
        if (tipoDeVeiculo.contains("carga")
                || tipoDeVeiculo.contains("Carga")
                || tipoDeVeiculo.contains("CARGA")) {
            return veicCarga().toString();
        }
        return cadastrarVeiculoPasseio().toString();
    }

    public Passeio cadastrarVeiculoPasseio() throws IOException, VelocException {
        Passeio passeio = new Passeio();

        System.out.println("Qtd. de passageiros: ");
        passeio.setQtdPassageiros(Integer.parseInt(br.readLine()));

        System.out.println("Marca: ");
        passeio.setMarca(br.readLine());

        System.out.println("Modelo: ");
        passeio.setModelo(br.readLine());

        System.out.println("Cor: ");
        passeio.setCor(br.readLine());

        System.out.println("Velocidade máxima: ");
        passeio.setVelocMax(Integer.parseInt(br.readLine()));

        System.out.println("Qtd. de rodas: ");
        passeio.setQtdRodas(Integer.parseInt(br.readLine()));

        return passeio;
    }

    public Carga veicCarga() throws IOException, VelocException {
        Carga carga = new Carga();

        System.out.println("Tara: ");
        carga.setTara(Integer.parseInt(br.readLine()));

        System.out.println("dominio.Carga máxima: ");
        carga.setCargaMax(Integer.parseInt(br.readLine()));

        System.out.println("Marca: ");
        carga.setMarca(br.readLine());

        System.out.println("Modelo: ");
        carga.setModelo(br.readLine());

        System.out.println("Cor: ");
        carga.setCor(br.readLine());

        System.out.println("Velocidade máxima: ");
        carga.setVelocMax(Integer.parseInt(br.readLine()));

        System.out.println("Qtd. de rodas: ");
        carga.setQtdRodas(Integer.parseInt(br.readLine()));
        
        return carga;
    }

    // METODO PARA CADA ESCOLHA
}
