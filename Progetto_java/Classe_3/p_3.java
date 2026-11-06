package Classe_3;

public class p_3 {

    public static void main (String[] args){

        Spettacolo_3 s1 = new Spettacolo_3(); 
        s1.setNome_spettacolo("Le cronache di Narnia");
        s1.setPosti_max(15);
        s1.setDescrizione_spettacolo("Serie di film fantasy basata sui romanzi di C.S. Lewis, che racconta le avventure dei fratelli Pevensie nel mondo magico di Narnia.");


        Cliente_3 c1 = new Cliente_3("Alessandro Rossi", "3331234567");
        Cliente_3 c2 = new Cliente_3("Martina Bianchi", "3339876543");
        Cliente_3 c3 = new Cliente_3("Lorenzo Verdi", "3334567890");
        Cliente_3 c4 = new Cliente_3("Chiara Neri", "3335678901");
        Cliente_3 c5 = new Cliente_3("Federico Gialli", "3336789012");


        Prenotazione_3 p1 = new Prenotazione_3(s1);
        p1.prenota(c1);
        p1.prenota(c2);
        p1.prenota(c3);
        p1.prenota(c4);
        p1.prenota(c5);
        p1.stampaListaPrenotazioni();
        p1.stampaListaAttesa();
        p1.postiLiberi();


        p1.disdici(c2);
        p1.stampaListaPrenotazioni();
        p1.stampaListaAttesa();
        p1.postiLiberi();
    }
    
}
