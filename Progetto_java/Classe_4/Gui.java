package Classe_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui {

    public Gui(){

        //FRAME
        JFrame frame1 = new JFrame("Prenotazione Spettacolo");
        frame1.setBounds(300, 100, 500, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CONTENITORE
        Container contenitore1 = frame1.getContentPane();

        //PANNELLO
        JPanel pannello1 = new JPanel();
        pannello1.setLayout(null);
        contenitore1.add(pannello1);

        //CREA IL MENU
        createMenuBar(frame1, pannello1);


        //TESTO
        JTextField testo1;
        testo1 = new JTextField("Benvenuto nel sistema di prenotazione spettacoli!");
        testo1.setBounds(50, 50, 400, 30);
        pannello1.add(testo1);


        //LABELS
        JLabel label1, label2;

        label1 = new JLabel("Nome Spettacolo:");
        label1.setBounds(50, 100, 150, 30);

        label2 = new JLabel("Numero Posti:");
        label2.setBounds(50, 150, 150, 30);

        pannello1.add(label1);
        pannello1.add(label2);
        

        //BOTTONE
        JButton bottone1 = new JButton("Prenota cliccando il bottone");
        bottone1.setBounds(50, 200, 200, 30);
        bottone1.setBackground(Color.GREEN);
        pannello1.add(bottone1);


        bottone1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label2.setText("Sovrascrive la label dopo aver premuto il bottone");
            }
        });

        //RENDERING
        frame1.setVisible(true);

    }

    private void createMenuBar(JFrame frame1, JPanel pannello1) {

        //SERVE PER CREARE LA BARRA DEL MENU
        var menuBar = new JMenuBar();

        //SERVE PER CREARE IL MENU "Gestione clienti"
        var fileMenu = new JMenu("Gestione clienti");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);


        //SERVE PER CREARE IL MENU "Spettacolo"
        var MenuItem1 = new JMenuItem("Spettacolo");
        MenuItem1.setMnemonic(KeyEvent.VK_F);

        MenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Hai premuto il bottone spettacolo");
                pannello1.setBackground(Color.BLUE);
            }
        });

        fileMenu.add(MenuItem1);
        
        //SERVE PER CREARE IL MENU "Cliente"
        var MenuItem2 = new JMenuItem("Cliente");
        MenuItem2.setMnemonic(KeyEvent.VK_C);
        MenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Hai premuto il bottone cliente");
                pannello1.setBackground(Color.RED);
            }
        });
        fileMenu.add(MenuItem2);


        //SERVE PER CREARE IL MENU "Prenotazioni"
        var MenuItem3 = new JMenuItem("Prenotazioni");
        MenuItem3.setMnemonic(KeyEvent.VK_P);
        fileMenu.add(MenuItem3);


        //SERVE PER ALLINEARE IL MENU "EXIT" A DESTRA
        menuBar.add(Box.createHorizontalGlue());

        //SERVE PER CREARE IL MENU "EXIT" A DESTRA
        var fileMenu2 = new JMenu("Exit");
        fileMenu2.setMnemonic(KeyEvent.VK_F);
        fileMenu2.setToolTipText("Exit application");
        fileMenu2.addActionListener((event) -> System.exit(0));
        menuBar.add(fileMenu2);

        frame1.setJMenuBar(menuBar);
    }
    
}
