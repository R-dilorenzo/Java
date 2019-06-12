import java.util.Calendar;
import java.util.Date;


public class Aeromobile {

	private Date ultimaRevisione;
	private Date prossimoVolo;
	private int numeroPasseggeri;

	public Date getUltimaRevisione() {
		return ultimaRevisione;
	}

	public void setUltimaRevisione(Date ultimaRevisione) {
		this.ultimaRevisione = ultimaRevisione;
	}

	public Date getProssimoVolo() {
		return prossimoVolo;
	}

	public void setProssimoVolo(Date prossimoVolo) {
		this.prossimoVolo = prossimoVolo;
	}

	public int getNumeroPasseggeri() {
		return numeroPasseggeri;
	}

	public void setNumeroPasseggeri(int numeroPasseggeri) {
		this.numeroPasseggeri = numeroPasseggeri;
	}

	/*
	 * uttori: o Uno senza parametri che imposta la data dell’ultima revisione alla data odierna, 
	 * la data del prossimo volo a null e il numero dei passeggeri a zero
	 */
	public Aeromobile() {
		ultimaRevisione = new Date();
		prossimoVolo = null;
		numeroPasseggeri = 0;
	}

	/*
	 * Uno che imposta la data dell’ultima revisione (si controlli che la data sia sempre antecedente
	 *  alla data odierna), la data del prossimo volo (si controlli che la data sia seguente alla data
	 *   odierna) e il numero dei passeggeri prenotati. 
	 */
	public Aeromobile(Date ultimaRevisione, Date prossimoVolo, int numeroPasseggeri) {
		this.numeroPasseggeri = numeroPasseggeri;
		Date cd = new Date();
		//if (ultimaRevisione.compareTo(cd) < 0) {
		if (ultimaRevisione.before(cd) ) {
			this.ultimaRevisione = ultimaRevisione;
		}
		if (prossimoVolo.compareTo(cd) > 0) {
		//if (prossimoVolo.after(cd)) {
			this.prossimoVolo = prossimoVolo;
		}
	}
	
	/*
	 * Il metodo isExpiredRevision che restituisce true se la revisione è scaduta,
	 *  considerando che un aeromobile si revisiona ogni tre anni. 
	 */
	public boolean isExpiredRevision( ) {
		Date date = new Date(); //prendo la data attuale
		Date revisione=getUltimaRevisione();  //prendo la data dell ultima revisione dal costruttore
		System.out.println("STO NEL METODO: la data presa con getUltimaRevisione() è :"+revisione);
		Calendar data = Calendar.getInstance(); //instanzio un oggetto calendar e inserisco oggetto Date date creato con la data attuale
		data.setTime(date);
		data.add(Calendar.YEAR, -3); //con oggetto calendar posso usare il metodo add e tolgo tre anni dalla data
		System.out.println("STO NEL METODO: Calendar data è :"+data);
		if(revisione.compareTo(data.getTime()) < 0) {
			System.out.println("la revisione è scaduta (superiore ai 3 anni)");
			return false;
		}
		else {
			System.out.println("la revisione è ancora buona!");
		}
		return true;
	}
	
	
	//metodo che presa la data di revisione dell aeromobile aggiunge 3 anni
	//indicando quale sarebbe la data della prossima revisione
//	public Calendar effettuaRevisione( ) {   //NON ERA QUELLO CHE VOLEVA
	public Calendar whenProssimaRevisione( ) {
		Date revisione=getUltimaRevisione();
		Calendar prossimaRevisione=Calendar.getInstance();
		prossimaRevisione.setTime(revisione);
		prossimaRevisione.add(Calendar.YEAR, 3);
		
		System.out.println("La data della prossima revisione è:"+prossimaRevisione);
		return prossimaRevisione;
	}
	
	/*
	 * Il metodo effettuaRevisione che imposta ad oggi la data di revisione dell’aeromobile. 
	 */
	public Date effettuaRevisione() {
		Date revisione=getUltimaRevisione();
		Date dataOdierna=new Date();
		if(revisione.compareTo(dataOdierna)==0) {
			return revisione;
		}else {
			setUltimaRevisione(dataOdierna);
		}
		return revisione;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Ultima Revisione: "+this.getUltimaRevisione()+" Prossim Volo: "+this.getProssimoVolo()+" numero di passeggeri: "+this.getNumeroPasseggeri()+"]";
	}

	public boolean equals(Object obj) {
		if(obj==null) return false;
		else{
			if(obj.getClass()!=this.getClass()) return false;
			else{
				Aeromobile aer=(Aeromobile) obj;
				if(aer.ultimaRevisione==this.ultimaRevisione && aer.prossimoVolo==this.prossimoVolo && aer.numeroPasseggeri==this.numeroPasseggeri  )
				return true;
				else return false;
			}
		}
	}
	
	
	/*
	 * 
Per confrontare due date vi basta scrivere il seguente codice:

java.util.Date datadioggi = java.util.GregorianCalendar.getInstance().getTime();
Calendar calendar = Calendar.getInstance();
calendar.set(2013, 1, 23);
if (datadioggi.compareTo(calendar.getTime()) < 0) {
    System.out.println("la data di oggi è precedente a calendar");
} else if(datadioggi.compareTo(calendar.getTime())>0) {
    System.out.println("la data di oggi è successiva a calendar");
} else if(datadioggi.compareTo(calendar.getTime()) == 0) {
    System.out.println("la data di oggi è la stessa di calendar");
}
	 *
	 */
	
}
