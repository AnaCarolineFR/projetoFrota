
package Model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFab;
    private String chassi;
    private int renavam;
    private String placa;
    private int idVe;

    public Veiculo(String marca, String modelo, String cor, int anoFab, String chassi, int renavam, String placa, int idVe) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFab = anoFab;
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.idVe = idVe;
    }
    
    public void imprimiDados(){
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }
    
    
    
    
}
