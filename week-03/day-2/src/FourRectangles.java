import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int[] x1 = {20, 80, 140, 200};
        int[] y1 = {20, 20, 20, 20};
        int[] x2 = {70, 130, 190, 250};
        int[] y2 = {70, 70, 70, 70};

        drawRectangles(graphics, x1, y1, x2, y2);
     }

     public static void drawRectangles(Graphics graphics, int[] x1, int[] y1, int[] x2, int[] y2) {
         for (int i = 1; i < 2; i++) {
             graphics.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
             graphics.drawRect(x1[i], y1[i], x2[i], y2[i]);
         }
     }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}