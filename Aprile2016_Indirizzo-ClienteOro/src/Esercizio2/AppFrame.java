package Esercizio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.*;

import Esercizio1.Cliente;
import Esercizio1.ClienteOro;
import Esercizio1.Indirizzo;
 
public class AppFrame  extends JFrame{  
	
	public AppFrame(String s) throws FileNotFoundException, IOException{
		super("APPLICAZIONE GRAFICA");
	    this.setJMenuBar(createBarra(s));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,400);
		this.setVisible(true);}
	
	public JMenuBar createBarra(String s) {
		JMenuBar barra=new JMenuBar();
		this.setJMenuBar(barra);
		barra.add(createExitItem());
	    return barra;}

	
				
		
		

			
		
	
	public JMenuItem createExitItem(){
		JMenuItem exit=new JMenuItem("Exit");
		class ExitListener implements ActionListener{

			public void actionPerformed(ActionEvent ev) {
				System.exit(1);}
			
		}
		ActionListener l=new ExitListener();
		exit.addActionListener(l);
		return exit;}

	
}

