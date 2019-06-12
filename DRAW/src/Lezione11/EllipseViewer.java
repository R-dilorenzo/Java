package Lezione11;
/*
 * MAIN:Apre un pannello con un ellisse disegnata si può modificare la dimensione del frame.
 * 		si avrà comunque un ellisse.
 */
import javax.swing.JFrame;

public class EllipseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("An ellipse");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      EllipseComponent component = new EllipseComponent();
      
      frame.add(component);
      frame.setVisible(true);
   }
}
