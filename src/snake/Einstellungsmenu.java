package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Einstellungsmenu extends JPanel implements ActionListener{

    JButton[] buttons= new JButton[8];

    Einstellungsmenu(){
        this.setPreferredSize(new Dimension(GamePanel.SCREEN_WIDTH,GamePanel.SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
    }

    public void main() {
        buttons[0]= new JButton("10x10");
        buttons[1]= new JButton("15x15");
        buttons[2]= new JButton("20x20");
        buttons[3]= new JButton("Grï¿½n");
        buttons[4]= new JButton("Blau");
        buttons[5]= new JButton("Rot");
        buttons[6]= new JButton("Gelb");
        buttons[7]= new JButton("Starten");
    }

    public void actionPerformed(ActionEvent e) {

    }
}

