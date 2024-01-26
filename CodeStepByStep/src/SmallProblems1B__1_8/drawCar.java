import java.awt.*;

public class drawCar {
    public static void main(String[] args) {
        // Create a DrawingPanel object
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();

        drawCar(g);
    }

    // Method to draw the car
    public static void drawCar(Graphics g) {
        // Set the color to black and draw the car body
        g.setColor(Color.BLACK);
        g.fillRect(10, 30, 100, 50); // Rectangle at x=10, y=30, width=100, height=50

        // Set the color to red and draw the wheels
        g.setColor(Color.RED);
        g.fillOval(20, 70, 20, 20); // Left wheel
        g.fillOval(80, 70, 20, 20); // Right wheel

        // Set the color to cyan and draw the windshield
        g.setColor(Color.CYAN);
        g.fillRect(80, 40, 30, 20); // Windshield at x=80, y=40, width=30, height=20
    }

    // Method to draw the car
    public void drawCar() {
        // Create a DrawingPanel with 200 width and 100 height, and dark gray background
        DrawingPanel panel = new DrawingPanel(200, 100);
        panel.setBackground(Color.LIGHT_GRAY); // Set background to light gray
        Graphics g = panel.getGraphics();

        // Set the color to black and draw the car body
        g.setColor(Color.BLACK);
        g.fillRect(10, 30, 100, 50); // Rectangle at x=10, y=30, width=100, height=50

        // Set the color to red and draw the wheels
        g.setColor(Color.RED);
        g.fillOval(20, 70, 20, 20); // Left wheel
        g.fillOval(80, 70, 20, 20); // Right wheel

        // Set the color to cyan and draw the windshield
        g.setColor(Color.CYAN);
        g.fillRect(80, 40, 30, 20); // Windshield at x=80, y=40, width=30, height=20
    }
}