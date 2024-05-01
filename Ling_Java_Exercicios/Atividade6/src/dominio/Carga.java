package dominio;

public class Carga extends Veiculo implements Calcular {

    private int cargaMax;
    private int tara;

    public Carga() {}

    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int cargaMax, int tara) {
        super();
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }

    @Override
    public int calcular() {
        return (int) (this.getVelocMax() + this.getQtdRodas() + this.getCargaMax() + this.getTara());
    }
}
