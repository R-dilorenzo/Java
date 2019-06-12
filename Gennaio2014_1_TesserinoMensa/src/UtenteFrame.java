import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class UtenteFrame extends JFrame {
	
	public UtenteFrame(ServizioMensa mensa){
		super("Frame");
		JPanel panel=new JPanel();
		this.mensa=mensa;
		lista=new JTextArea();
		lista.setEditable(false);
		panel.add(lista,BorderLayout.NORTH);
		panel.add(createCompraPasto(),BorderLayout.EAST);
	    panel.add(createVisualizza(),BorderLayout.WEST);
	    add(panel);
	
	}
	
	
	public JPanel createCompraPasto(){
		JPanel panel=new JPanel();
		JButton compra=new JButton("Compra Pasto");
	    inserisci=new JTextField(15);
		 
		class CompraListener implements ActionListener{

			public void actionPerformed(ActionEvent event) {
				try {
					mensa.usaTesserino(Integer.parseInt(inserisci.getText()));
				} catch (NumberFormatException | TesserinoScadutoExeception
						| SaldoInsufficienteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		}
		ActionListener listener=new CompraListener();
		compra.addActionListener(listener);
		panel.add(compra);
		panel.add(inserisci);
		return panel;}
	
	
	public JPanel createVisualizza(){
		JPanel panel=new JPanel();
		JButton button=new JButton("Visualizza somma");
		label=new JLabel();
		 class VisualizzaInformazioni implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				label.setText(""+mensa.calcolaTotale());
				}
			 
		 }
		 ActionListener listener=new VisualizzaInformazioni();
		 button.addActionListener(listener);
		 panel.add(button);
		 panel.add(label);
		 return panel;}
	
	private JTextArea lista;
	private ServizioMensa mensa;
	private JLabel label;
	JTextField inserisci;
}
