package Lezione11;
/*
 * Main: Compare in output un frame con due rettangoli disegnati nell angolo in alto a sinistra
 *		aventi come size 300 e 400
 */
import javax.swing.JFrame;

public class TwoSquareViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("TwoSquares");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TwoSquareComponent component = new TwoSquareComponent();
      
      frame.add(component);
      frame.setVisible(true);
   }
}
