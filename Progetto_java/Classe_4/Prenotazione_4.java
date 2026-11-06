package Classe_4;

import java.util.ArrayList;


public class Prenotazione_4 {
    
    private Spettacolo_4 spettacoloN;
    private ArrayList<Cliente_4> listaPrenotazioni = new ArrayList<>();
    private ArrayList<Cliente_4> listaAttesa = new ArrayList<>();


    //COSTRUTTORE
    public Prenotazione_4(Spettacolo_4 spettacoloN) {
        this.spettacoloN = spettacoloN;
    }

    
    public void prenota(Cliente_4 clienteN){
        if (postiLiberi() >= 1){
            listaPrenotazioni.add(clienteN);
            System.out.println("Prenotazione effettuata per il cliente: " + clienteN.getNome() + " per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        } else {
            listaAttesa.add(clienteN);
            System.out.println("Posti esauriti. Il cliente: " + clienteN.getNome() + " è stato aggiunto alla lista d'attesa per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        }
    }


    public void disdici(Cliente_4 clienteN){
        if (listaPrenotazioni.remove(clienteN) && !listaAttesa.isEmpty()) {
            Cliente_4 clienteInAttesa = listaAttesa.remove(0);
            listaPrenotazioni.add(clienteInAttesa);
            System.out.println("Posto assegnato al cliente in lista d'attesa: " + clienteInAttesa.getNome());
        }
    }

    
    public int postiLiberi(){
        int postiLiberi = this.spettacoloN.getPosti_max() - listaPrenotazioni.size();

        System.out.println("\n"+ "Sono rimasti: " + postiLiberi + " posti liberi.");
        return postiLiberi;
    }


    public void stampaListaPrenotazioni(){
        System.out.println("Lista prenotazioni per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        for (Cliente_4 el : listaPrenotazioni) {
            System.out.println(el.getNome());
        }
    }


    public void stampaListaAttesa(){
        System.out.println("Lista d'attesa per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        for (Cliente_4 el : listaAttesa) {
            System.out.println(el.getNome());
        }
    }
}
