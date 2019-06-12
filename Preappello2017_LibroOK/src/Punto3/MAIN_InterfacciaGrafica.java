package Punto3;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MAIN_InterfacciaGrafica {

	private JFrame frame;
	private JTextArea t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAIN_InterfacciaGrafica window = new MAIN_InterfacciaGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public MAIN_InterfacciaGrafica() throws ClassNotFoundException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws IOException, ClassNotFoundException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JTextArea t = new JTextArea();
		t.setBounds(78, 114, 264, 99);
		frame.getContentPane().add(t);
		
		/*
		 * 
		 * COMBO BOX PER SCEGLIERE DAL FILE GLI AUTORI
		 * 
		 */
		JComboBox comboBox = new JComboBox();
		 // deserialization test
	    FileInputStream fileIn = new FileInputStream("StudentList.txt");
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    ArrayList<Libro> a2 = (ArrayList<Libro>) in.readObject();
	    in.close();
	    fileIn.close();
	    for (Libro i : a2) {
	    		comboBox.addItem(i.getAutore());
	    		
		    } // for
		comboBox.setBounds(15, 42, 147, 26);
		frame.getContentPane().add(comboBox);
		
		
		
	
		
		JButton btnVisualizza = new JButton("Visualizza");	   
		btnVisualizza.addMouseListener(new MouseAdapter() {
			/*
			 * 
			 * MOUSE EVENT CLICK
			 * MOSTRA A SECONDO DELLA SCELTA NELLA COMBOBOX LE INFO RELATIVE
			 * 
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ("autore".equals(comboBox.getSelectedItem())) {
					t.setText("Titolo: "+a2.get(0).getTitolo()+"\n"+"Numero di pagine"+a2.get(0).getPagine()+"\n"+"Capitoli"+a2.get(0).getCapitoli()+"\n");
				}
				if("Deuf Vin".equals(comboBox.getSelectedItem())){
			t.setText("Titolo: "+a2.get(1).getTitolo()+"\n"+"Numero di pagine"+a2.get(1).getPagine()+"\n"+"Capitoli"+a2.get(1).getCapitoli()+"\n");
		}
			}
		});
		btnVisualizza.setBounds(241, 41, 115, 29);
		frame.getContentPane().add(btnVisualizza);
		
		
		/*
		JTextArea textArea = new JTextArea();
		textArea.setBounds(78, 114, 264, 99);
		frame.getContentPane().add(textArea);
		*/
	}
}
