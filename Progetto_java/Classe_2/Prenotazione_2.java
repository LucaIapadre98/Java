package Classe_2;
import java.util.ArrayList;

public class Prenotazione_2{
    
    private Spettacolo_2 spettacoloN;
    private ArrayList<Cliente_2> listPrenotazioni = new ArrayList<>();


    //COSTRUTTORE
    public Prenotazione_2(Spettacolo_2 spettN) {
        this.spettacoloN = spettN;
    }


    //PRENOTAZIONE E DISDETTA PRENOTAZIONE
    public void prenota(Cliente_2 clienteN){
        if (postiLiberi() >= 1){
            listPrenotazioni.add(clienteN);
        } else {
            System.out.println("\n" + "Non ci sono posti disponibili per questo spettacolo!");
        }
    }

    public void disdici(Cliente_2 clienteN){
        listPrenotazioni.remove(clienteN);
    }


    public int postiLiberi(){
        int postiLiberi = this.spettacoloN.getPosti_max() - listPrenotazioni.size();

        System.out.println("\n"+ "Sono rimasti: " + postiLiberi + " posti liberi.");
        return postiLiberi;
    }


    public void stampaLista(){
        System.out.println("Lista prenotazioni: ");
        for (Cliente_2 el : listPrenotazioni) {
            System.out.println("Nome: " + el.getNome());
        }
        System.out.println("Posti prenotati: " + listPrenotazioni.size());
    }
}
