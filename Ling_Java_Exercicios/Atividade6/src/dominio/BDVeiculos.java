package dominio;

import exception.VeicExistException;
import exception.VelocException;

import java.io.IOException;

public class BDVeiculos {

    Passeio[] listaPasseio = new Passeio[5];
    Carga[] listaCarga = new Carga[5];
    Leitura l = new Leitura();

    public BDVeiculos() {}

    public BDVeiculos(Passeio[] passeios, Carga[] cargas) {
        this.listaPasseio = passeios;
        this.listaCarga = cargas;
    }

    public Passeio[] getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(Passeio[] listaPasseio) throws VeicExistException {
        this.listaPasseio = listaPasseio;
    }

    public Carga[] getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(Carga[] listaCarga) {
        this.listaCarga = listaCarga;
    }

    public void validaPlaca(String tipoVeiculo, String placa) throws VeicExistException, VelocException, IOException {

        if (tipoVeiculo.equals("Passeio")) {
           for (int i = 0; i < listaPasseio.length; i++) {
               if (listaPasseio[i].getPlaca().equals(placa)) {
                   throw new VeicExistException();
               }
                l.cadastrarVeiculoPasseio();
           }
        }
        if (tipoVeiculo.equals("Carga")) {
            for (int i = 0; i < listaCarga.length; i++) {
                if (listaCarga[i].getPlaca().equals(placa)) {
                    throw new VeicExistException();
                }
            }
        }
    }


}
