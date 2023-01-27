package Hauptmenue;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


import tictactoe.TicTacToe;
import snake.GameFrame;
import ssp.*;

public class HauptmenuePanel extends JPanel{
    private JButton snake,tic,schere,credit;
    File imageFile = new File("design/Logo.png");
    static BufferedImage logo;
    public HauptmenuePanel() {

        JPanel panel = new JPanel(new FlowLayout());
        this.setLayout(new BorderLayout());
        snake = new JButton("Snake");
        panel.add(snake);

        tic = new JButton("Tic-Tac-Toe");
        panel.add(tic);

        schere = new JButton("Schere-Stein-Papier");
        panel.add(schere);

        this.add(panel,BorderLayout.CENTER);


        Panel c = new Panel(new BorderLayout());
        this.setBackground(Color.WHITE);
        credit = new JButton("Credits");
        c.add(credit,BorderLayout.SOUTH);

        this.add(c,BorderLayout.EAST);

        try {
            logo = ImageIO.read(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.add(new JLabel (new ImageIcon(logo)),BorderLayout.NORTH);




        ButtonControl bc = new ButtonControl();
        snake.addActionListener(bc);
        tic.addActionListener(bc);
        schere.addActionListener(bc);
        credit.addActionListener(bc);
    }
    private class ButtonControl implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if( e.getSource() == tic) {
                TicTacToe t = new TicTacToe();
            }
            if(e.getSource() == credit) {
                Credit c = new Credit();
            }
            if(e.getSource() == snake) {
                GameFrame f = new GameFrame();
            }
            if(e.getSource() == schere) {
                daLabel obj =  new daLabel();
                obj.GameRunner();
            }
        }

    }
}

