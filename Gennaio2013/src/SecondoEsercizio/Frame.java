package SecondoEsercizio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Frame extends JFrame {
	
	public Frame(){
		super("SECONDO ESERCIZIO");
		JMenuBar barra=new JMenuBar();
		this.setJMenuBar(barra);
		barra.add(createMenu());
		
	}

	public JMenu createMenu(){
		JMenu menu=new JMenu("File");
		menu.add(createApriItem());
		menu.add(createExitItem());
		
		return menu;
		}
	
	/** Creazione del menu EXIT per uscire dal programma
	 * 
	 * @return Menu->Exit
	 */
	public JMenuItem createExitItem(){
		JMenuItem exit=new JMenuItem("Exit");
		class ExitListener implements ActionListener{

			public void actionPerformed(ActionEvent uscita) {
				System.exit(0);
			}
			
		}
		ActionListener l=new ExitListener();
		exit.addActionListener(l);
		return exit;
	}

	
	public JMenuItem createApriItem(){
		JMenuItem apri=new JMenuItem("Apri");
		class ApriListener implements ActionListener{

			public void actionPerformed(ActionEvent apri) {
				try {
					File file=new File("C:\\Users\\Alessandra Zullo\\Documents\\Documenti università" +
							"\\Secondo Anno\\Programmazione2\\Esami\\PROVE\\Gennaio2013\\src\\SecondoEsercizio","testo.txt");
                          BufferedReader reader=new BufferedReader(new FileReader(file));
                          String s;
                          while((s=(reader.readLine()))!=null){
                        	  PaginaDiTestoFrame frame=new PaginaDiTestoFrame(s);
                        	}
                          
				} catch (FileNotFoundException e) {
					System.out.println("Il file non è stato trovato");
				} catch (IOException e) {
				System.out.println("Errore di lettura");	
				}
				
			}
			
		}
		ActionListener l=new ApriListener();
		apri.addActionListener(l);
		return apri;
	}
private JTextArea area;
}
