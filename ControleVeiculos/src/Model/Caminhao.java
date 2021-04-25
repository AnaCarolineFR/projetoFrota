
package Model;

import Model.Veiculo;

public class Caminhao extends Veiculo{
    private int quantDeEixos;

    public Caminhao(int quantDeEixos, String marca, String modelo, String cor, int anoFab, String chassi, int renavam, String placa, int idVe) {
        super(marca, modelo, cor, anoFab, chassi, renavam, placa, idVe);
        this.quantDeEixos = quantDeEixos;
    }

    public int getQuantDeEixos() {
        return quantDeEixos;
    }

    public void setQuantDeEixos(int quantDeEixos) {
        this.quantDeEixos = quantDeEixos;
    }

   
    
    
    
}
