import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    static int heroX;
    static int heroY;
    PositionedImage hero = new PositionedImage("hero-down.png", 0, 0);
    GameMaps gameMap = new GameMaps();
    int[][] actualMap;

    public Board() {
        this.actualMap = gameMap.getRandomMap();
        this.heroX = 0;
        this.heroY = 0;

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    public void paint(Graphics graphics) {
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                if (actualMap[i][j] == 0) {
                    PositionedImage floor = new PositionedImage("floor.png", 0 + i * 72, 0 + j *72);
                    floor.draw(graphics);
                } else {
                    PositionedImage wall = new PositionedImage("wall.png", 0 + i * 72, 0 + j * 72);
                    wall.draw(graphics);
                }
            }
        }

        super.paint(graphics);
        hero.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game"); // ez az, ami felugrik amikor futtatom
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
 }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (this.heroY == 0 || this.actualMap[this.heroX / 72][(this.heroY / 72) - 1] == 1) {
                this.heroY -= 0;
            } else {
                this.heroY -= 72;
            }
            this.hero = new PositionedImage("hero-up.png", this.heroX, this.heroY);
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (this.heroY == 648 || this.actualMap[this.heroX / 72][(this.heroY / 72) + 1] == 1) {
                this.heroY += 0;
            } else {
                this.heroY += 72;
            }
            this.hero = new PositionedImage("hero-down.png", this.heroX, this.heroY);
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (this.heroX == 0 || this.actualMap[(this.heroX / 72) - 1][this.heroY / 72] == 1) {
                this.heroX -= 0;
            } else {
                heroX -= 72;
            }
            this.hero = new PositionedImage("hero-left.png", this.heroX, this.heroY);
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (this.heroX == 648 || this.actualMap[(this.heroX / 72) + 1][this.heroY / 72] == 1) {
                this.heroX += 0;
            } else {
                this.heroX += 72;
            }
            this.hero = new PositionedImage("hero-right.png", this.heroX, this.heroY);
        }

        repaint();
    }
}