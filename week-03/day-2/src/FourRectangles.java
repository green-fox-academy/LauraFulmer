import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int[] x = {20, 80, 140, 200};
        int[] y = {20, 20, 20, 20};
        int[] width = {50, 50, 50, 50};
        int[] height = {50, 50, 50, 50};

        drawRectangles(graphics, x, y, width, height);
     }

     public static void drawRectangles(Graphics graphics, int[] x, int[] y, int[] width, int[] height) {
         for (int i = 0; i < 4; i++) {
             graphics.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
             graphics.drawRect(x[i], y[i], width[i], height[i]);
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