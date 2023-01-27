package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

    public GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");

        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
