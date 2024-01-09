import java.awt.*;

public class drawCar {
    public static void main(String[] args) {
        // Create a DrawingPanel object
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();

        drawCar(g);
    }

    public static void drawCar(Graphics g) {
        // Set the background color to light gray
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 200, 100);

        // Draw the car body
        g.setColor(Color.BLACK);
        g.fillRect(10, 30, 100, 50);

        // Draw the wheels
        g.setColor(Color.RED);
        g.fillOval(20, 70, 20, 20);
        g.fillOval(80, 70, 20, 20);

        // Draw the windshield
        g.setColor(Color.CYAN);
        g.fillRect(80, 40, 30, 20);
    }
}