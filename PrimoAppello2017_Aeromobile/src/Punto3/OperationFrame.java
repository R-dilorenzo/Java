package Punto3;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OperationFrame extends JFrame {

	private JLabel labelFinal;
	
	public OperationFrame(){
		
		labelFinal=new JLabel();
		createPanel();
		}
	
	public void createPanel(){
		JPanel panel=new JPanel();
		//panel.setLayout(new GridLayout(3,3));
	
		panel.add(labelFinal);
		add(panel);		
	}
	
	
}
