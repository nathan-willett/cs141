import graphics.DrawingPanel;
import java.awt.*;

public class Squares3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 300);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        // Draw figures at specified positions with specified sizes
        drawFigure(g, 50, 50, 20);  // Original size for the first figure
        drawFigure(g, 250, 10, 50); // Size 50 for the top right figure
        drawFigure(g, 180, 115, 180); // Size 180 for the bottom right figure
    }

    // Parameterized method to draw a figure at a given position and size
    public static void drawFigure(Graphics g, int x, int y, int size) {
        g.setColor(Color.RED);
        for (int i = 1; i <= 5; i++) {
            g.drawRect(x, y, size * i, size * i);
        }

        g.setColor(Color.BLACK);
        for (int i = 1; i <= 5; i++) {
            g.drawLine(x, y, x + size * i, y + size * i);
        }
    }
}

