import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		
		Aeromobile a=new Aeromobile();
		System.out.println("a="+a);
		a.effettuaRevisione();
		System.out.println("la revisione è stata fatta!");
		a.isExpiredRevision(); //stampa "la revisione è ancora buona!" se l'intervallo tra la data dell ultima revisione e quella attuale è inferiore ai 3 anni
		
		//creo un oggetto Aeromobile con il secondo costruttore con
				//UltimaRevisione=11/11/2017,prossimoVolo=01/02/2019 e numeroPasseggeri=200
				  String s,s1;
			       Date ultimaRev = null,prossVol = null;
			       //si procura la data sotto forma di una stringa nel formato SHORT
			       //System.out.println("Inserisci la data dell'ultima revisione [gg/mm/yyyy]: ");
			       //Scanner in = new Scanner(System.in);
			       //s = in.nextLine();
			       s="11/11/2017";
			       //System.out.println("Inserisci la data del prossimo volo: [gg/mm/yyyy]: ");
			       //s1 = in.nextLine();
			       s1="01/02/2019";
			       //converte la stringa della data in un oggetto di classe Date
			       try{
			           DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			           //imposta che i calcoli di conversione della data siano rigorosi       
			           formatoData.setLenient(false);           
			           ultimaRev = formatoData.parse(s);
			           prossVol=formatoData.parse(s1);
			       } catch (ParseException e) {
			           System.out.println("Formato data non valido.");
			       }
			       //visualizza la data non formattata (sfruttando implicitamente il metodo toString dell'oggetto)
			       System.out.println(ultimaRev);
			       Aeromobile c=new Aeromobile(ultimaRev,prossVol,200);

			       if(c.isExpiredRevision()==false) {
			    	   System.out.println("FALSE");
			       }else {
			    	   System.out.println("TRUE");
			       }
			       
			       System.out.println("eseguo effettuaRevisione");
			       c.effettuaRevisione();
			       System.out.println(c);
			       
		
		
		/*
		 //costruisco aeromobile da input utente
		  String s,s1;
	       Date ultimaRev = null,prossVol = null;
	       //si procura la data sotto forma di una stringa nel formato SHORT
	       System.out.println("Inserisci la data dell'ultima revisione [gg/mm/yyyy]: ");
	       Scanner in = new Scanner(System.in);
	       s = in.nextLine();
	       System.out.println("Inserisci la data del prossimo volo: [gg/mm/yyyy]: ");
	       s1 = in.nextLine();
	       //converte la stringa della data in un oggetto di classe Date
	       try{
	           DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
	           //imposta che i calcoli di conversione della data siano rigorosi       
	           formatoData.setLenient(false);           
	           ultimaRev = formatoData.parse(s);
	           prossVol=formatoData.parse(s1);
	       } catch (ParseException e) {
	           System.out.println("Formato data non valido.");
	       }
	       //visualizza la data non formattata (sfruttando implicitamente il metodo toString dell'oggetto)
	       System.out.println(ultimaRev);
	       System.out.println(prossVol);
	       
	       
	       Aeromobile b=new Aeromobile(ultimaRev,prossVol,200);
	       System.out.println("b="+b);
	       
	       b.effettuaRevisione();
	       b.isExpiredRevision();
	       */
	       
	       
	       /*
		Date x=new Date(1990);
		System.out.println("data x="+x.toString());
		Date y=new Date(2020-12-12);

		System.out.println("data y="+y.toString());
		Aeromobile b=new Aeromobile(x,y,200);
		
		System.out.println("b="+b);
		
		b.effettuaRevisione();
		b.isExpiredRevision();
		*/
	}

}
