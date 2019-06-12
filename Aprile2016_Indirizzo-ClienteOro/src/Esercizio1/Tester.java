package Esercizio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Eccezioni.ScontoInvalidException;

public class Tester {

	/**
	 * @param args
	 * @throws ScontoInvalidException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ScontoInvalidException, FileNotFoundException, IOException, ClassNotFoundException {

		Indirizzo ind1=new Indirizzo("Appia", 6);
		Profilo p1=new Profilo("Descrizione numero 1");
        
		//istanzia 5 clienti oro
		ClienteOro c1=new ClienteOro("Alessandra", 0,ind1, 10, p1);
		ClienteOro c=null;
		 ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("file.dat"));
	        o.writeObject(c1);
	        o.close();
	        ObjectInputStream i=new ObjectInputStream(new FileInputStream("file.dat"));
	        

        
		
		
		

		

		

	}

}
