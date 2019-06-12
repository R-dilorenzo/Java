package Lezione11;

import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D; 
import javax.swing.JComponent;

// A component that draws a circle.
//Metodi PER CircleViewer.java
public class CircleComponent extends JComponent{
		
	private double radius;
	
	public CircleComponent(double r){
		radius = r;
		}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 2 * radius, 2 * radius);
		g2.draw(circle);

	}
	
	
}
