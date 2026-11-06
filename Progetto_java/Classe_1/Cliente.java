package Classe_1;

public class Cliente {

    private String nome;
    private String telefono;

    public Cliente(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}