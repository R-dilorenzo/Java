import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Eccezioni.FaultException;


public class Starter2 {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		ObjectInputStream i=null;
		
		try {
		 i=new ObjectInputStream(new FileInputStream("file.dat"));
		} catch (FileNotFoundException e) {
			// Se il file non esiste
              ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("file.dat"));
			
			Lavatrice l1=new Lavatrice("Index","Lavatrice numero 1");
			Lavatrice l2=new Lavatrice("Indesit","Lavatrice numero2");
			Lavatrice l3=new Lavatrice("Rex","Lavatrice numero3");
			
			Programma lana=new Programma("lana");
			Programma seta=new Programma("seta");
			Programma cotone=new Programma("cotone");
			
			l1.aggiungiProgramma(lana);
			l1.aggiungiProgramma(seta);
			l1.aggiungiProgramma(cotone);
			
			l2.aggiungiProgramma(cotone);
			l2.aggiungiProgramma(lana);
			l2.aggiungiProgramma(seta);
			
			l3.aggiungiProgramma(lana);
			l3.aggiungiProgramma(cotone);
			l3.aggiungiProgramma(seta);
			o.writeObject(l1);
			o.writeObject(l2);
			o.writeObject(l3);
			o.close();
			 i=new ObjectInputStream(new FileInputStream("file.dat"));
		
		}
		
		
		catch (IOException e) {
			System.out.println("ERRORE DI I/O");
		}
		finally{
			DispositivoSelezioneProgrammi l4=(DispositivoSelezioneProgrammi)i.readObject();
			Lavatrice l5=(Lavatrice)i.readObject();
			Lavatrice l6=(Lavatrice)i.readObject();
			l4.start();
			try {
				l4.next();
			} catch (FaultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l4.stop();
			
		}

	}

}
