import dominio.BDVeiculos;
import dominio.Carga;
import dominio.Leitura;
import dominio.Passeio;
import exception.VeicExistException;
import exception.VelocException;

import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException, VeicExistException {

        final String VEICULO_CARGA = "Carga";
        final String VEICULO_PASSEIO = "Passeio";

        Scanner sc = new Scanner(System.in);

        BDVeiculos bdVeiculos = new BDVeiculos();
        Passeio[] carrosPasseio = new Passeio[5];
        Carga[] carrosCarga = new Carga[5];
        Leitura l = new Leitura();

        // Menu
        System.out.println("Sistema de Gestão de Veículos - Menu inicial");
        System.out.println("1. Cadastrar veículo de passeio");
        System.out.println("2. Cadastrar veículo de carga");
        System.out.println("3. Imprimir todos os veículos de passeio");
        System.out.println("4. Imprimir todos os veículos de carga");
        System.out.println("5. Imprimir veículo de passeio pela placa");
        System.out.println("6. Imprimir veículo de carga pela placa");
        System.out.println("7. Sair do sistema");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                try {
                    System.out.println("Placa: ");
                    String placa = sc.next();
                    bdVeiculos.validaPlaca(VEICULO_PASSEIO, placa);
                    for (Passeio carroPasseio : carrosPasseio) {
                        System.out.println("Marca: ");
                        carroPasseio.setMarca(sc.next());
                        System.out.println("Modelo: ");
                        carroPasseio.setModelo(sc.next());
                        System.out.println("Cor: ");
                        carroPasseio.setCor(sc.next());
                        System.out.println("Placa: ");
                        carroPasseio.setPlaca(sc.next());
                        System.out.println("Qtd. de passageiros: ");
                        carroPasseio.setQtdPassageiros(sc.nextInt());
                        System.out.println("Qtd de rodas: ");
                        carroPasseio.setQtdRodas(sc.nextInt());
                    }
                    } catch (VelocException e) {
                    throw new RuntimeException(e);
                }
                catch (VeicExistException e) {
                    throw e;
                }
                break;
            case 2:
                try {
                    System.out.println("Placa: ");
                    String placa = sc.next();
                    bdVeiculos.validaPlaca(VEICULO_CARGA, placa);
                } catch (VeicExistException e) {
                    throw e;
                } catch (VelocException e) {
                    throw new RuntimeException(e);
                }
                break;
        }

//        for (Passeio carroPasseio : carrosPasseio) {

    }
}