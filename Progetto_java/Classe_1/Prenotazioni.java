package Classe_1;

import java.util.ArrayList;

public class Prenotazioni{

    //RICREARE L'OGGETTO SPETTACOLO E LA LISTA DEI CLIENTI CHE HANNO PRENOTATO
    private Spettacolo spettacoloN;
    private ArrayList<Cliente> listPrenotazioni = new ArrayList<>();


    //COSTRUTTORE
    public Prenotazioni(Spettacolo spettN) {
        this.spettacoloN = spettN;
    }


    //PRENOTAZIONE E DISDETTA PRENOTAZIONE
    public void prenota(Cliente clienteN){
        listPrenotazioni.add(clienteN);
    }

    public void disdiciPrenotazione(Cliente clienteN){
        listPrenotazioni.remove(clienteN);
    }


    //METODI PER STAMPARE LA LISTA DEI CLIENTI CHE HANNO PRENOTATO E I POSTI LIBERI
    void postiLiberi(){
        int postiLiberi = this.spettacoloN.getPosti_max() - listPrenotazioni.size();
        System.out.println("Sono rimasti: " + postiLiberi + " posti liberi");
    }

    void stampaLista(){
        System.out.println("Lista prenotazioni: ");
        for (Cliente el : listPrenotazioni) {
            System.out.println("Nome: " + el.getNome());
        }
        System.out.println("Posti prenotati: " + listPrenotazioni.size());
    }

}