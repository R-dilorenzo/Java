import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainPunto1_2 {

	public static void main(String[] args) throws FaultException {

		// aggiungo un aereo con costruttore nullo
		Aeromobile a = new Aeromobile();
		Deposito deposito = new Deposito();
		deposito.aggiungiAereo(a);
		
		//creo un oggetto Aeromobile con il secondo costruttore con
		//UltimaRevisione=11/11/2017,prossimoVolo=01/02/2019 e numeroPasseggeri=200
		  String s,s1;
	       Date ultimaRev = null,prossVol = null;
	       //si procura la data sotto forma di una stringa nel formato SHORT
	       s="11/11/2017";
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
	       	       
	       Aeromobile c=new Aeromobile(ultimaRev,prossVol,200);
	       deposito.aggiungiAereo(c);
	       
	       //creo un oggetto Aeromobile con il secondo costruttore con
			//UltimaRevisione=15/01/2018,prossimoVolo=15/01/2019 e numeroPasseggeri=300
			  String q,q1;
		       Date ultimaRev1 = null,prossVol1 = null;
		       //si procura la data sotto forma di una stringa nel formato SHORT
		       q="15/01/2018";
		       q1="15/01/2019";
		       //converte la stringa della data in un oggetto di classe Date
		       try{
		           DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
		           //imposta che i calcoli di conversione della data siano rigorosi       
		           formatoData.setLenient(false);           
		           ultimaRev1 = formatoData.parse(q);
		           prossVol1=formatoData.parse(q1);
		       } catch (ParseException e) {
		           System.out.println("Formato data non valido.");
		       }
		       
		       Aeromobile c1=new Aeromobile(ultimaRev1,prossVol1,300);
		       deposito.aggiungiAereo(c1);
		       
		       System.out.println(deposito);
		       
		   	/*
				//PER TESTARE SE FUNZIONA AggiungiAeromobile()
				System.out.println("provo ad inserire dinuovo a");
				deposito.aggiungiAereo(a);
				System.out.println("Deposito dopo aver aggiunto la seconda volta a : "+deposito);
				*/
		       
		       /*
		        System.out.println("per ogni aereo inserito indica la prossima data della revisione (aggiunge 3 anni ad ultimaRevisione)");
		         deposito.WhenAllRevisioni();
		        */
			System.out.println("Eseguo il metodo EffettuaAllRevisioni(); e stampoil deposito aggiornato la data dell ultimaRevisione di tutti gli aerei presenti sarà la data attuale");
			deposito.effettuaAllRevisioni();
			System.out.println(deposito);
			
			
			System.out.println("eseguo il metodo CercaAereo()");
			System.out.println("se inserisco una data PRECEDENTE alla data del prossimo volo di un aereo con revisione non scaduta mi restituisce aereo");
			String y;
			Date input=null;
			System.out.println("Inserisci la data per CercaAereo [gg/mm/yyyy]: ");
		       Scanner in = new Scanner(System.in);
		       y = in.nextLine();
		       try{
		           DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
		           //imposta che i calcoli di conversione della data siano rigorosi       
		           formatoData.setLenient(false);           
		           input = formatoData.parse(y);
		       } catch (ParseException e) {
		           System.out.println("Formato data non valido.");
		       }
			deposito.cercaAereo(input);
		
			deposito.cercaAereo2(input);
			
		       

	}

}
