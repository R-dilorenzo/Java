import java.util.GregorianCalendar;

import javax.swing.JFrame;


public class Test {

	
	public static void main(String[] args) {

		ServizioMensa mensa=new ServizioMensa();
		
		mensa.aggiungi(new TesserinoStudente(01, "nome1", "cognome1","1",true,'A',new GregorianCalendar(2004,01,01)));
		mensa.aggiungi(new TesserinoStudente(02, "nome2", "cognome2","2",true,'B',new GregorianCalendar(2020,01,01)));
		mensa.aggiungi(new TesserinoStudente(03, "nome3", "cognome3","3",true,'A',new GregorianCalendar(2020,01,01)));
		mensa.aggiungi(new TesserinoStudente(04, "nome4", "cognome4","4",true,'A',new GregorianCalendar(2020,01,01)));
		mensa.aggiungi(new TesserinoStudente(05, "nome5", "cognome5","5",true,'B',new GregorianCalendar(2020,01,01)));
		
		mensa.aggiungi(new TesserinoPersonale(11, "Nome1", "Cognome1", "Informatica", 0,"docente"));
		mensa.aggiungi(new TesserinoPersonale(12, "Nome2", "Cognome2", "Informatica", 0,"docente"));
		mensa.aggiungi(new TesserinoPersonale(13, "Nome3", "Cognome3", "Informatica", 0,"amministrativo"));
		mensa.aggiungi(new TesserinoPersonale(14, "Nome4", "Cognome4", "Informatica", 0,"docente"));
		mensa.aggiungi(new TesserinoPersonale(15, "Nome5", "Cognome5", "Informatica", 0,"amministrativo"));

		UtenteFrame frame=new UtenteFrame(mensa);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setVisible(true);


		
		
	}

}
