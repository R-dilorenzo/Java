package SecondoEsercizio;

import javax.swing.JOptionPane;

public class ApriiFrameTester {

	
	public static void main(String[] args) {
		ApriiFrame frame=new ApriiFrame();
		JOptionPane pane=new JOptionPane();
		String s=pane.showInputDialog("Inserisci il nome del file");
		int i=pane.showConfirmDialog(frame,"Sei sicuro di voler aprire il file?");
		if(i==0) pane.showMessageDialog(frame,"Si");
		
		
	}

}
