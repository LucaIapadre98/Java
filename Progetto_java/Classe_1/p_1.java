package Classe_1;

public class p_1{

    public static void main (String[] args){


        // ISTANZA CLASSE SPETTACOLO 
        Spettacolo s1 = new Spettacolo ();
        s1.setNome_spettacolo("Il Signore degli Anelli");
        s1.setPosti_max(10);
        s1.setDescrizione_spettacolo("Trilogia cinematografica fantasy epica diretta da Peter Jackson, basata sull'omonimo romanzo di J.R.R. Tolkien.");


        //CREAZIONE NUOVI CLIENTI
        Cliente c1 = new Cliente("Mario Rossi", "3331234567");
        Cliente c2 = new Cliente("Luca Bianchi", "3339876543");
        Cliente c3 = new Cliente("Giulia Verdi", "3334567890");
        Cliente c4 = new Cliente("Francesca Neri", "3335678901");

        //CREAZIONE DELLE PRENOTAZIONI
        Prenotazioni p1 = new Prenotazioni(s1);
        p1.prenota(c1);
        p1.prenota(c2);
        p1.prenota(c3);
        p1.prenota(c4);
        p1.stampaLista();
        p1.postiLiberi();
        p1.disdici(c2);
        p1.prenota(c3);
    }
}