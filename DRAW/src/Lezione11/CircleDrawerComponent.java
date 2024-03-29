package Lezione11;


import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
   Displays a circle at a given position.
   
*/
public class CircleDrawerComponent extends JComponent
{ 
   private Ellipse2D.Double circle;
   private int x;
   private int y;
   private int radius;

   public CircleDrawerComponent()
   {  
      x = 0;
      y = 0;
      radius = 0;
      circle = null;
   }
   
   public void setPositionAndSize(int aX, int aY, int aRadius)
   {
      x = aX;
      y = aY;
      radius = aRadius;

      // the circle that the paintComponent method draws
      circle = new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2);
      repaint();
   }

   public void paintComponent(Graphics g)
   {
      if (circle == null) return;
      Graphics2D g2 = (Graphics2D) g;      
      g2.draw(circle);
   }
}
