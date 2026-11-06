package Classe_3;

import java.util.ArrayList;

public class Prenotazione_3 {
    
    private Spettacolo_3 spettacoloN;
    private ArrayList<Cliente_3> listaPrenotazioni = new ArrayList<>();
    private ArrayList<Cliente_3> listaAttesa = new ArrayList<>();


    //COSTRUTTORE
    public Prenotazione_3(Spettacolo_3 spettacoloN) {
        this.spettacoloN = spettacoloN;
    }

    
    public void prenota(Cliente_3 clienteN){
        if (postiLiberi() >= 1){
            listaPrenotazioni.add(clienteN);
            System.out.println("Prenotazione effettuata per il cliente: " + clienteN.getNome() + " per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        } else {
            listaAttesa.add(clienteN);
            System.out.println("Posti esauriti. Il cliente: " + clienteN.getNome() + " è stato aggiunto alla lista d'attesa per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        }
    }


    public void disdici(Cliente_3 clienteN){
        if (listaPrenotazioni.remove(clienteN) && !listaAttesa.isEmpty()) {
            Cliente_3 clienteInAttesa = listaAttesa.remove(0);
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
        for (Cliente_3 el : listaPrenotazioni) {
            System.out.println(el.getNome());
        }
    }


    public void stampaListaAttesa(){
        System.out.println("Lista d'attesa per lo spettacolo: " + spettacoloN.getNome_spettacolo());
        for (Cliente_3 el : listaAttesa) {
            System.out.println(el.getNome());
        }
    }
}