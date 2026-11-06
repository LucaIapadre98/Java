package Classe_1;

import java.util.ArrayList;

public class Prenotazioni{

    private Spettacolo spettacolo;
    private ArrayList<Cliente> listPrenotazioni = new ArrayList<>();


    //COSTRUTTORE
    public Prenotazioni(Spettacolo spettN) {
        this.spettacolo = spettN;
    }


    public void prenota(Cliente clienteN){
        listPrenotazioni.add(clienteN);
    }

    public void disdiciPrenotazione(Cliente clienteN){
        listPrenotazioni.remove(clienteN);
    }


    void poatiLiberi(){

        int postiLiberi = this.spettacolo.getPosti_max() - listPrenotazioni.size();
        System.out.println("Posti liberi: " + postiLiberi);
    }

    void stampaList(){
        System.out.println("Lista prenotazioni: ");
        for (Cliente el : listPrenotazioni) {
            System.out.println("Nome: " + el.getNome());
        }
        System.out.println("Posti prenotati: " + listPrenotazioni.size());
    }


}