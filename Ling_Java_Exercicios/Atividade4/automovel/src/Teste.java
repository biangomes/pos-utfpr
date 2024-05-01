import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Carga carro1 = new Carga();
        carro1.setPlaca("LGI-0364");
        carro1.setMarca("Fiat");
        carro1.setModelo("Palio 2009");
        carro1.setCor("Azul");
        carro1.setVelocMax(150.0f);
        carro1.setQtdRodas(4);
        carro1.setTara(1084);
        carro1.setCargaMax(705);
        carro1.setVelocMax(164f);

        Carga carro2 = new Carga();
        carro2.setPlaca("MCG-9670");
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Onix");
        carro2.setCor("Prata");
        carro2.setVelocMax(150.0f);
        carro2.setQtdRodas(4);
        carro2.setTara(1084);
        carro2.setCargaMax(705);
        carro2.setVelocMax(164f);

        Carga carro3 = new Carga();
        carro3.setPlaca("IVE-5981");
        carro3.setMarca("Honda");
        carro3.setModelo("Fit");
        carro3.setCor("Vermelho");
        carro3.setVelocMax(150.0f);
        carro3.setQtdRodas(4);
        carro3.setTara(1084);
        carro3.setCargaMax(705);

        Carga carro4 = new Carga();
        carro4.setPlaca("IVE-2934");
        carro4.setMarca("Ferrari");
        carro4.setModelo("Fit");
        carro4.setCor("Roxo");
        carro4.setVelocMax(150.0f);
        carro4.setQtdRodas(4);
        carro4.setTara(1084);
        carro4.setCargaMax(705);

        Carga carro5 = new Carga();
        carro5.setPlaca("IVE-2934");
        carro5.setMarca("Ferrari");
        carro5.setModelo("Fit");
        carro5.setCor("Roxo");
        carro5.setMotor();
        carro5.setVelocMax(150.0f);
        carro5.setQtdRodas(4);
        carro5.setTara(1084);
        carro5.setCargaMax(705);

        Passeio carro6 = new Passeio();
        carro6.setPlaca("MYV-7946");
        carro6.setMarca("Fiat");
        carro6.setModelo("Uno 1998");
        carro6.setCor("Preto");
        carro6.setVelocMax(300.0f);
        carro6.setQtdRodas(4);

        Passeio carro7 = new Passeio();
        carro7.setPlaca("AXD-0611");
        carro7.setMarca("Honda");
        carro7.setModelo("Civic Sport");
        carro7.setCor("Preto");
        carro7.setVelocMax(150.0f);
        carro7.setQtdRodas(4);

        Passeio carro8 = new Passeio();
        carro8.setPlaca("VEI-5981");
        carro8.setMarca("Fiat");
        carro8.setModelo("Toro");
        carro8.setCor("Cinza");
        carro8.setMotor();
        carro8.setVelocMax(300.0f);
        carro8.setQtdRodas(4);

        Passeio carro9 = new Passeio();
        carro9.setPlaca("VEI-5981");
        carro9.setMarca("Fiat");
        carro9.setModelo("Toro");
        carro9.setCor("Cinza");
        carro9.setMotor();
        carro9.setVelocMax(300.0f);
        carro9.setQtdRodas(4);

        Passeio carro10 = new Passeio();
        carro10.setPlaca("VEI-5981");
        carro10.setMarca("Fiat");
        carro10.setModelo("Toro");
        carro10.setCor("Cinza");
        carro10.setMotor();
        carro10.setVelocMax(300.0f);
        carro10.setQtdRodas(4);

        List<Carga> carrosCarga = new ArrayList<>();
        carrosCarga.add(carro1);
        carrosCarga.add(carro2);
        carrosCarga.add(carro3);
        carrosCarga.add(carro4);
        carrosCarga.add(carro5);

        List<Passeio> carrosPasseio = new ArrayList<>();
        carrosPasseio.add(carro6);
        carrosPasseio.add(carro7);
        carrosPasseio.add(carro8);
        carrosPasseio.add(carro9);
        carrosPasseio.add(carro10);

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

        if (escolha == 1 || escolha == 2) {
            Leitura ent = new Leitura();

            if (escolha == 1) {
                ent.entDados("passeio");
            }
            else {
                ent.entDados("carga");
            }
        }

        if (escolha == 2 || escolha == 3) {
            if (escolha == 3) {
                carrosPasseio.forEach(i -> System.out.println(i.getPlaca().toString() + " | " + i.getModelo().toString()
                        + " | " + i.getMarca().toString() + " | " + i.getCor().toString()
                        + i.calcVel(i.getVelocMax()) + " | " + i.calcular()));
            }

            carrosCarga.forEach(i -> System.out.println(i.getPlaca().toString() + " | " + i.getModelo().toString()
                    + " | " + i.getMarca().toString() + " | " + i.getCor().toString()
                    + i.calcVel(i.getVelocMax()) + " | " + i.calcular()));
        }

        if (escolha == 6) {
            System.out.println("Digite a placa de veículo: ");
            String entPlaca = sc.next();
            if (escolha == 5) {
                carrosPasseio.forEach(i -> {
                    if (i.getPlaca().equals(entPlaca)) {
                        String str = i.getPlaca().toString() + " | " + i.getModelo().toString() + " | "
                                + i.getMarca().toString() + " | " + i.getCor().toString()
                                + i.calcVel(i.getVelocMax()) + " | " + i.calcular();
                        System.out.println(str);
                    } else {
                        throw new IllegalArgumentException("Não existe veículo de passeio com essa placa.");
                    }
                });
            }
            carrosCarga.forEach(i -> {
                if (i.getPlaca().equals(entPlaca)) {
                    String str = i.getPlaca().toString() + " | " + i.getModelo().toString() + " | "
                            + i.getMarca().toString() + " | " + i.getCor().toString()
                            + i.calcVel(i.getVelocMax()) + " | " + i.calcular();
                    System.out.println(str);
                } else {
                    throw new IllegalArgumentException("Não existe veículo de carga com essa placa");
                }
            });
        }
    }
}