package Hauptmenue;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
import javax.swing.*;

public class HauptmenueFrame extends JFrame{
        public HauptmenueFrame() {
            super("Hauptmenü");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(500,300);
            HauptmenuePanel p = new HauptmenuePanel();
            this.add(p);
            this.setResizable(false);


            this.setVisible(true);
        }
}


