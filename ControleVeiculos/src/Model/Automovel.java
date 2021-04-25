
package Model;

public class Automovel extends Veiculo{
    
   private String tipoAuto;

    public Automovel(String tipoAuto, String marca, String modelo, String cor, int anoFab, String chassi, int renavam, String placa, int idVe) {
        super(marca, modelo, cor, anoFab, chassi, renavam, placa, idVe);
        this.tipoAuto = tipoAuto;
    }

    

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    
    
}
