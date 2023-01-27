package Hauptmenue;

import javax.swing.JFrame;

import java.awt.*;

import javax.swing.*;

public class Credit extends JFrame{

    public Credit() {
        super("Ehrungen");
        this.setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(5,1));
        JLabel l = new JLabel("Vielen Dank an alle die am Projekt mitgeholfen haben (:");
        JLabel l2 = new JLabel("Emmanuel Akwaonu(Programmierer): Danke für deine tatkräfige Unterstützung (Schere-Stein-Papier)");
        JLabel l3 = new JLabel("Dawid Brigauan(Prokektleiter und Programmierer): Danke für deine motivierenden Worte (Snake)");
        JLabel l4 = new JLabel("Dunja Cosic(Programmiererin): Danke für deine harte Arbeit");
        JLabel l5 = new JLabel("Alexander Haschka(Programmierer): Danke für alles(TiktTakToe und Hauptmenü).");
        p.add(l);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        this.add(p,BorderLayout.CENTER);


        this.setSize(700,300);
        this.setResizable(false);
        this.setVisible(true);
    }
}

