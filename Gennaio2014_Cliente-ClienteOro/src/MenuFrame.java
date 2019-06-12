import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class MenuFrame extends JFrame {
    
	public MenuFrame(){
		JMenuBar barra=new JMenuBar();
		barra.add(createMenu());
		add(barra,BorderLayout.NORTH);


    }
	
	public  JMenu createMenu(){
		JMenu file=new JMenu("File");
	//	file.add(createApriItem());
		file.add(createAcquistoItem());
		file.add(createEsciItem());
		return file;
	}

//	public JMenuItem createApriItem(){
	//	JMenuItem apri=new JMenuItem("Apri");
		//final JLabel label=new JLabel();
		/*class ApriListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				ObjectInputStream i;
			
				try{ // se il file non è presente
			i=new ObjectInputStream(new FileInputStream("file.txt"));
			
			
			
				}catch(FileNotFoundException ev){
					ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("file.txt"));
					
					//5 Clienti oro
					ClienteOro cliente1=new ClienteOro("cliente1", 1, "indirizzo1", 10, 10);
					ClienteOro cliente2=new ClienteOro("cliente2", 2, "indirizzo2", 10, 10);
					ClienteOro cliente3=new ClienteOro("cliente3", 3, "indirizzo3", 10, 10);
					ClienteOro cliente4=new ClienteOro("cliente4", 4, "indirizzo4", 10, 10);
					ClienteOro cliente5=new ClienteOro("cliente5", 5, "indirizzo5", 10, 10);
					 
					//5 Clienti ordinari
					ClienteOrdinario clienteOrd1=new ClienteOrdinario("clienteOrd1", 1, "indirizzo1", 10, 5);
					ClienteOrdinario clienteOrd2=new ClienteOrdinario("clienteOrd1", 2, "indirizzo1", 10, 4);
					ClienteOrdinario clienteOrd3=new ClienteOrdinario("clienteOrd1", 3, "indirizzo1", 10, 4);
					ClienteOrdinario clienteOrd4=new ClienteOrdinario("clienteOrd1", 4, "indirizzo1", 10, 5);
					ClienteOrdinario clienteOrd5=new ClienteOrdinario("clienteOrd1", 5, "indirizzo1", 10, 5);

					//Scrittura degli oggetti(clienti oro) nel file
					o.writeObject(cliente1);
					o.writeObject(cliente2);
					o.writeObject(cliente3);
					o.writeObject(cliente4);
					o.writeObject(cliente5);
					
					o.writeObject(clienteOrd1);
					o.writeObject(clienteOrd2);
					o.writeObject(clienteOrd3);
					o.writeObject(clienteOrd4);
					o.writeObject(clienteOrd5);
				} 
				finally {
					i=new ObjectInputStream(new FileInputStream("file.txt"));
					//Lettura dal file
					for(int in=0;in<10;in++){
					Cliente clienteLetto=(Cliente)i.readObject();
					if(clienteLetto instanceof ClienteOrdinario){
						ClienteOrdinario ord=(ClienteOrdinario) clienteLetto;
						label.setText(ord.toString());
						}
					else if(clienteLetto instanceof ClienteOro){
						ClienteOro ord=(ClienteOro) clienteLetto;
						label.setText(ord.toString());
					}
					}
				}
			
			
			
				
			}
			
		}
		ApriListener l=new ApriListener();
		apri.addActionListener(l);
		return apri;
		
	}*/
	public JMenuItem createAcquistoItem(){
		JMenuItem acquisto=new JMenuItem("Acquisto");
		return acquisto;
		
	}
	public JMenuItem createEsciItem(){
		JMenuItem esci=new JMenuItem("Esci");
		class EsciListener implements ActionListener{

			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
			
		}
		EsciListener l=new EsciListener();
		esci.addActionListener(l);
		return esci;
	}
}
