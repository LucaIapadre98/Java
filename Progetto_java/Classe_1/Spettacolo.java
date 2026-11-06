package Classe_1;

public class Spettacolo {

    private String nome_spettacolo;
    private String descrizione_spettacolo;
    private int posti_max;

    public String getNome_spettacolo() {
        return nome_spettacolo;
    }

    public void setNome_spettacolo(String nome spettacolo) {
        this.nome_spettacolo = nome_spettacolo;
    }

    public int getPosti_max(){
        return posti_max;
    }

    public String getDescrizione_spettacolo() {
        return descrizione_spettacolo;
    }

    public void setDescrizione_spettacolo(String descrizione_spettacolo) {
        this.descrizione_spettacolo = descrizione_spettacolo;
    }
}