package Esercizio2;

import javax.swing.JFrame;

import Esercizio1.CartaDiCredito;
import Esercizio1.CorsoDiFormazione;
import Esercizio1.Portafoglio;
import Esercizio1.Studente;

public class Tester {

	public static void main(String[] args) {
		CorsoDiFormazione corso1=new CorsoDiFormazione("Informatica",5,15);
		CorsoDiFormazione corso2=new CorsoDiFormazione("Matematica",3,5);		
		CorsoDiFormazione corso3=new CorsoDiFormazione("Fisica",2,10);
		
		Studente s1=new Studente("Studente1",new CartaDiCredito(50,100));
		Studente s2=new Studente("Studente2",new CartaDiCredito(50,10));
		Studente s3=new Studente("Studente3",new CartaDiCredito(10,5));
		Studente s4=new Studente("Studente4",new CartaDiCredito(50,20));
		Studente s5=new Studente("Studente5",new CartaDiCredito(12,5));
		
		Studente s01=new Studente("Studente01",new Portafoglio(50));
		Studente s02=new Studente("Studente02",new Portafoglio(25));
		Studente s03=new Studente("Studente03",new Portafoglio(150));
		Studente s04=new Studente("Studente04",new Portafoglio(20));
		Studente s05=new Studente("Studente05",new Portafoglio(10));
		
		s1.iscrizione(corso1);
		s2.iscrizione(corso1);
		s3.iscrizione(corso1);
		s4.iscrizione(corso1);
		s5.iscrizione(corso1);
		s05.iscrizione(corso1);
		s02.iscrizione(corso1);
		s03.iscrizione(corso2);
		s04.iscrizione(corso1);
		s01.iscrizione(corso2);
		
		FinestraFrame frame=new FinestraFrame(corso1,corso2,corso3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setVisible(true);
		
		
		

	}

}
