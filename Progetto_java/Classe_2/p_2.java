package Classe_2;

public class p_2 {
    
    public static void main(String[] args){

        Spettacolo_2 s1 = new Spettacolo_2();
        s1.setNome_spettacolo("Harry Potter e la Pietra Filosofale");
        s1.setPosti_max(5);
        s1.setDescrizione_spettacolo("Film di successo mondiale");


        Cliente_2 c1 = new Cliente_2("Luigi Rossi", "3331234567");
        Cliente_2 c2 = new Cliente_2("Andrea Bianchi", "3339876543");
        Cliente_2 c3 = new Cliente_2("Simone Verdi", "3334567890");
        Cliente_2 c4 = new Cliente_2("Claudio Neri", "3335678901");
        Cliente_2 c5 = new Cliente_2("Francesca Gialli", "3336789012");

        Prenotazione_2 p1 = new Prenotazione_2(s1);
        p1.prenota(c1);
        p1.prenota(c2);
        p1.prenota(c3);
        p1.prenota(c4);
        p1.prenota(c5);
        p1.stampaLista();
        p1.postiLiberi();


        p1.disdici(c2);
        p1.stampaLista();
        p1.postiLiberi();
    }
}
