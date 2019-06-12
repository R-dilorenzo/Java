package Esercizio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Eccezioni.ScontoInvalidException;
import Esercizio1.Cliente;
import Esercizio1.ClienteOrdinario;
import Esercizio1.ClienteOro;
import Esercizio1.Indirizzo;
import Esercizio1.Profilo;

public class AppTester {

	
	public static void main(String[] args) throws ScontoInvalidException,IOException, ClassNotFoundException{
		try {
			//Prova ad aprire il file se non lo trovi viene lanciata la FileNotFoundException
			// gestita in modo tale che vada ad istanziare 10 Clienti e li scriva nel file file.dat
			ObjectInputStream i=new ObjectInputStream(new FileInputStream("file.dat"));
			i.close();
		
		}catch (FileNotFoundException e1) {
			Indirizzo ind1=new Indirizzo("Appia", 6);
			Profilo p1=new Profilo("Descrizione numero 1");
            
			//istanzia 5 clienti oro
			ClienteOro c1=new ClienteOro("Alessandra", 0,ind1, 10, p1);
            ClienteOro c2=new ClienteOro("Alessandre", 1,ind1, 17, p1);
            ClienteOro c3=new ClienteOro("Alessandri", 2,ind1, 10, p1);
            ClienteOro c4=new ClienteOro("Alessandro", 3,ind1, 15, p1);
            ClienteOro c5=new ClienteOro("Alessandru", 4,ind1, 20, p1);
            //istanzia 5 clienti ordinari
            ClienteOrdinario cl1=new ClienteOrdinario("Ale", 5, ind1, 4);
            ClienteOrdinario cl2=new ClienteOrdinario("Ales", 5, ind1, 3);
            ClienteOrdinario cl3=new ClienteOrdinario("Aless", 5, ind1, 2);
            ClienteOrdinario cl4=new ClienteOrdinario("Alessa", 5, ind1, 4);
            ClienteOrdinario cl5=new ClienteOrdinario("Alessan", 5, ind1, 1);
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("file.dat"));
           //scrivi i 5 clienti oro
            o.writeObject(c1);
            o.writeObject(c2);
            o.writeObject(c3);
            o.writeObject(c4);
            o.writeObject(c5);
            //scrivi i 5 clientiordinari
            o.writeObject(cl1);
            o.writeObject(cl2);
            o.writeObject(cl3);
            o.writeObject(cl4);
            o.writeObject(cl5);
            o.close();
			
            //chiudi lo stream

}
		finally { 
			
				  AppFrame frame=new AppFrame("file.dat");
		            frame.setVisible(true);
			}
			
		

	}

}
