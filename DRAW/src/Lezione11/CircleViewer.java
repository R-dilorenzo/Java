package Lezione11;
/*
 * Main: inserisci un numero che corrisponde al raggio del cerchio 
 * 		in output si avrà una finestra con un cerchio in alto a sinistra del frame
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleViewer {

	public static void main(String[] args){

		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String input = JOptionPane.showInputDialog("radius:");
		double r = Double.parseDouble(input);
		
		CircleComponent component = new CircleComponent(r);
		
		frame.add(component);
		frame.setVisible(true);
		
		}
	
	
}
