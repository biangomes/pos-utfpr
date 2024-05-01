import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo();
        carro1.setPlaca("LGI-0364");
        carro1.setMarca("Fiat");
        carro1.setModelo("Palio 2009");
        carro1.setCor("Azul");
        carro1.setVelocMax(150.0f);
        carro1.setQtdRodas(4);

        Veiculo carro2 = new Veiculo();
        carro2.setPlaca("MYV-7946");
        carro2.setMarca("Fiat");
        carro2.setModelo("Uno 1998");
        carro2.setCor("Preto");
        carro2.setVelocMax(150.0f);
        carro2.setQtdRodas(4);

        Veiculo carro3 = new Veiculo();
        carro3.setPlaca("MCG-9670");
        carro3.setMarca("Chevrolet");
        carro3.setModelo("Onix");
        carro3.setCor("Prata");
        carro3.setVelocMax(150.0f);
        carro3.setQtdRodas(4);

        Veiculo carro4 = new Veiculo();
        carro4.setPlaca("AXD-0611");
        carro4.setMarca("Honda");
        carro4.setModelo("Civic Sport");
        carro4.setCor("Preto");
        carro4.setVelocMax(150.0f);
        carro4.setQtdRodas(4);

        Veiculo carro5 = new Veiculo();
        carro5.setPlaca("IVE-5981");
        carro5.setMarca("Honda");
        carro5.setModelo("Fit");
        carro5.setCor("Vermelho");
        carro5.setMotor();
        carro5.setVelocMax(150.0f);
        carro5.setQtdRodas(4);
        carro5.setMotor();
        carro5.getMotor().setPotencia(500);
        carro5.getMotor().setQtdPist(3);


        List<Veiculo> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        for (Veiculo carro : carros) {
            System.out.println(carro.getPlaca());
            System.out.println(carro.getMarca());
            System.out.println(carro.getModelo());
            System.out.println(carro.getCor());

            if (carro.getMotor() != null) {
                System.out.println(carro.getMotor().getPotencia());
                System.out.println(carro.getMotor().getQtdPist());
            }

            System.out.println("==============================================");
        }
    }
}