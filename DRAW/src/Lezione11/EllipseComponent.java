package Lezione11;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
   A component containing an ellipse filled with your favorite
   color that touches the component boundaries. 
 */
public class EllipseComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      // Draw a large ellipse that touches the boundaries of this component.

      Graphics2D g2 = (Graphics2D) g;

      double width = getWidth();
      double height = getHeight();
		
      Ellipse2D oval = new Ellipse2D.Double(0, 0, width, height );
		
      g2.setColor(Color.RED);
      g2.fill(oval);

      g2.setColor(Color.BLACK);
      g2.draw(oval);
   }
}
