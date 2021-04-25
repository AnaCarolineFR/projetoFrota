
package Model;

import Model.Veiculo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(int cilindradas, String marca, String modelo, String cor, int anoFab, String chassi, int renavam, String placa, int idVe) {
        super(marca, modelo, cor, anoFab, chassi, renavam, placa, idVe);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
}
