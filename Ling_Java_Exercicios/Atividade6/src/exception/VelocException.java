package exception;

public class VelocException extends Exception {
    public VelocException() {
        System.out.println("A velocidade maxima esta fora dos limites brasileiros");
    }
}
