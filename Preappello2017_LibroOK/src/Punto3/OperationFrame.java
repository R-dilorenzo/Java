package Punto3;

import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Libro.FaultException;

public class OperationFrame extends JFrame {

	private JLabel labelFinal;
	private JComboBox<String> cbx;
	private JButton button;
	private JTextField text;
		
	public OperationFrame() throws ClassNotFoundException, IOException{
		createComboBox();
		createButton();
		text = new JTextField(16); 
		labelFinal=new JLabel();
		createPanel();
		}
	
	public void createPanel(){
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		panel.add(cbx);
		panel.add(button);
		panel.add(text);
		
		panel.add(labelFinal);
		add(panel);		
	}
	
	public void createComboBox() throws IOException, ClassNotFoundException {
		 cbx = new JComboBox<String>();
		 
		 // deserialization test
		    FileInputStream fileIn = new FileInputStream("StudentList.txt");
		    ObjectInputStream in = new ObjectInputStream(fileIn);
		    ArrayList<Libro> a2 = (ArrayList<Libro>) in.readObject();
		    in.close();
		    fileIn.close();
		    for (Libro i : a2) {
		    		cbx.addItem(i.getAutore());
		    	
			    } // for
		
		 cbx.setEditable (false);
	}
	
	
	
	
	public void createButton() throws IOException, ClassNotFoundException{
		button=new JButton("Visualizza");
		 // deserialization test
	    FileInputStream fileIn = new FileInputStream("StudentList.txt");
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    ArrayList<Libro> a2 = (ArrayList<Libro>) in.readObject();
	    in.close();
	    fileIn.close();
		
		class OperationListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if ("autore".equals(cbx.getSelectedItem())) {
					text.setText("Titolo: "+a2.get(0).getTitolo()+"\n"+"Numero di pagine"+a2.get(0).getPagine()+"\n"+"Capitoli"+a2.get(0).getCapitoli()+"\n");
				}
				if("Deuf Vin".equals(cbx.getSelectedItem())){
			text.setText("Titolo: "+a2.get(1).getTitolo()+"\n"+"Numero di pagine"+a2.get(1).getPagine()+"\n"+"Capitoli"+a2.get(1).getCapitoli()+"\n");
		}
			
		
		}}
		ActionListener listener=new OperationListener();
		button.addActionListener(listener);
		}
	

}
