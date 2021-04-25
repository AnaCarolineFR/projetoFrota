package Model;

public class Motorista {
    private String nome;
    private String turno;
    private int identidicacao;

    public Motorista(String nome, String turno, int identidicacao, int salario, int idade, int tipoHab) {
        this.nome = nome;
        this.turno = turno;
        this.identidicacao = identidicacao;
        this.salario = salario;
        this.idade = idade;
        this.tipoHab = tipoHab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getIdentidicacao() {
        return identidicacao;
    }

    public void setIdentidicacao(int identidicacao) {
        this.identidicacao = identidicacao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(int tipoHab) {
        this.tipoHab = tipoHab;
    }
    private int salario;
    private int idade;
    private int tipoHab;
    
    
    
}
