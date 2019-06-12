import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Eccezioni.FaultException;


public class Starter {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
     // VERIFICO L'ESISTENZA DEL FILE
		File file=new File("file.dat");
		// SE IL FILE NON ESISTE CREALO E COPIA DEGLI OGGETTI
		if(!(file.exists())){
			ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
			
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
		}
		ObjectInputStream i=new ObjectInputStream(new FileInputStream(file));
		DispositivoSelezioneProgrammi l4=(DispositivoSelezioneProgrammi)i.readObject();
		Lavatrice l5=(Lavatrice)i.readObject();
		Lavatrice l6=(Lavatrice)i.readObject();
		l4.start();
		try {
			int in=0;
			in++;
			l4.next();
		} catch (FaultException e) {
			System.out.println("Numero di tentativi: "+i);
		}
		l4.stop();
		
		
		
		
	
	}

}
