package dominio;

public class Passeio extends Veiculo implements Calcular {

    private int qtdPassageiros;

    public Passeio() {}
    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPassageiros) {
        super();
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }

    @Override
    public int calcular() {
        int size = this.getPlaca().length()
                + this.getMarca().length()
                + this.getModelo().length()
                + this.getCor().length();
        return size;
    }
}
