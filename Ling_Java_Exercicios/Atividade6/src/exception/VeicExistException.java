package exception;

public class VeicExistException extends Exception {

    public VeicExistException() {
        System.out.println("Ja existe um veiculo com esta placa");
    }
}
