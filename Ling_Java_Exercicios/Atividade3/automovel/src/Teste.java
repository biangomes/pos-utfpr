import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

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

        for (Carga carroCarga : carrosCarga) {
            System.out.println("================ CARROS CARGA ================");
            System.out.println("Placa := " + carroCarga.getPlaca());
            System.out.println("Marca := " + carroCarga.getMarca());
            System.out.println("Modelo := " + carroCarga.getModelo());
            System.out.println("Cor := " + carroCarga.getCor());
            System.out.println("Velocidade máx. := " + carroCarga.getVelocMax());
            System.out.println("Tara := " + carroCarga.getTara());
            System.out.println("Carga máxima := " + carroCarga.getCargaMax());
            System.out.println("==============================================");
        }

        for (Passeio carroPasseio : carrosPasseio) {
            System.out.println("================ CARROS PASSEIO ================");
            System.out.println("Placa := " + carroPasseio.getPlaca());
            System.out.println("Marca := " + carroPasseio.getMarca());
            System.out.println("Modelo := " + carroPasseio.getModelo());
            System.out.println("Cor := " + carroPasseio.getCor());
            System.out.println("Velocidade máx. := " + carroPasseio.getVelocMax());
            System.out.println("Quantidade de passageiros := " + carroPasseio.getQtdPassageiros());
            System.out.println("==============================================");
        }
    }
}