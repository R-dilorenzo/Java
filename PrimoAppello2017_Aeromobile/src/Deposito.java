import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Deposito {

	private ArrayList<Aeromobile> aereom=new ArrayList<>();

	//costruttore vuoto
	public Deposito() {	}
	
	/*
	 * aggiungere nuovi aeromobili al deposito. Verificare che l’aeromobile non sia
	 *  già presente. Nel caso in cui invece sia già presente lanciare una eccezione controllata;
	 */
	public void aggiungiAereo(Aeromobile a) throws FaultException {
		boolean tmp=false;
		//aereom.add(a);
		for(Aeromobile listaAer: aereom) {
			if(a.equals(listaAer)) {
				tmp=true;
				System.out.println("Aeromobile presente");
				throw new FaultException();
			}
		}
		if(tmp==false) {
			System.out.println("l'aeromobile non era presente");
			aereom.add(a);
		}
	}
	
	/*
	 * NON CONTROLLA SE LA DATA DI INPUT SIA MAGGIORE DELLA DATA ATTUALE
	 * ricercare gli aeromobili disponibili nel deposito a partire da una data fornita 
	 * come input e che non abbiano la revisione scaduta;  
	 */
	public void cercaAereo(Date input) {
		for(Aeromobile ae:aereom) {
			Date disponibile=ae.getProssimoVolo();
//se la data PROSSIMO VOLO (disponibile)è diversa da null e SUCCESSIVA alla data Input e la revisione non è scaduta
			if(disponibile != null) {
			if(disponibile.compareTo(input)>0 ) {
				if( ae.isExpiredRevision()==true) {
					System.out.println("l'aereo disponibile è= "+ae);
				}
		
			}
			}
		}
		System.out.println("fine aerei disponibili");
	}
	
	
	/*
	 * CONTROLLO ANCHE CHE LA DATA DI INPUT SIA MAGGIORE DELLA DATA ATTUALE
	 * ricercare gli aeromobili disponibili nel deposito a partire da una data fornita 
	 * come input e che non abbiano la revisione scaduta;  
	 */
	public void cercaAereo2(Date input) {
		Date dataOggi=new Date();
		if(input.compareTo(dataOggi)>=0) {
		for(Aeromobile ae:aereom) {
			Date disponibile=ae.getProssimoVolo();
//se la data PROSSIMO VOLO (disponibile) è SUCCESSIVA alla data Input e diversa da null e la revisione non è scaduta
			if(disponibile != null) {
			if(disponibile.compareTo(input)>0  ) {
				if( ae.isExpiredRevision()==true) {
					System.out.println("l'aereo disponibile è= "+ae);
				}
		
			}else {
				System.out.println("questo aereo non è disponibile");
			}
			}
			else {
				System.out.println("questo aereo non è disponibile");
			}
		}
		}
		else {
			System.out.println("la data deve essere maggiore della data attuale");
		}
		System.out.println("fine aerei disponibili");
	}
	
	/*
	 * effettuare la revisione di tutti gli aeromobili presenti nel deposito. 
	 */
	public void effettuaAllRevisioni() {
		for(Aeromobile ae:aereom) {
			ae.effettuaRevisione();
		}
		return;
	}
	
	/*
	 * NON RICHIESTO
	 * effettua il metodo whenRevisione a tutti gli aerei 
	 * mostra la data della prossima revisione di tutti gli aerei nel deposito
	 */
	public void WhenAllRevisioni() {
		for(Aeromobile ae:aereom) {
			ae.whenProssimaRevisione();
			System.out.println("\n");
		}
		return;
	}
	
	@Override
	public String toString() {
	//	return "Deposito [aereom=" + aereom + ", toString()=" + super.toString() + "]";
	return "Deposito=["+aereom+"]";
	}
	
}
