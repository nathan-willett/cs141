import java.awt.*;

public class smileyFace {
   public static void main(String [] args) {
     smileyFace2();
   }
   
   public static void smileyFace2() {
      DrawingPanel panel = new DrawingPanel(300, 150);
      Graphics g = panel.getGraphics();
      g.setColor(Color.BLACK);
      g.drawRect(20, 10, 100, 100);
      g.drawOval(40, 30, 20, 20);
      g.drawOval(80, 30, 20, 20);
    
      g.drawOval(65, 60, 10, 10);
      g.drawLine(40, 80, 50, 90);
      g.drawLine(50, 90, 90, 90);
      g.drawLine(90, 90, 100, 80);

      g.drawString("Smile!", 20, 140);
   }
}