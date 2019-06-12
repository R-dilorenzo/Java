package Lezione11;

/*
 * Main: cliccare in un punto della finestra e inserire un numero come raggio per disegnare un cerchio con centro 
 * nel punto in cui si è cliccato
 */
import javax.swing.JFrame;

/**
   Allows the user to specify a circle by typing the radius in a text field
   and then clicking on the center.
 */
public class CircleDrawerViewer
{  
   public static void main(String[] args)
   {
      JFrame frame = new CircleDrawerFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("CircleDrawer");
      frame.setVisible(true);
  }
}
