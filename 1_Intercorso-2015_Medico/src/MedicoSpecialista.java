import java.util.ArrayList;
import java.util.Scanner;

public class MedicoSpecialista extends Medico {

	public MedicoSpecialista(int codiceIdentificativo, String nome, String cognome, String specializzazione,
			int numeroVisiteEffettuate, ArrayList<Paziente> pazienti) {
		super(codiceIdentificativo, nome, cognome);
		this.specializzazione = specializzazione;
		this.numeroVisiteEffettuate = numeroVisiteEffettuate;
		this.pazienti = pazienti;
	}


	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public int getNumeroVisiteEffettuate() {
		return numeroVisiteEffettuate;
	}

	public void setNumeroVisiteEffettuate(int numeroVisiteEffettuate) {
		this.numeroVisiteEffettuate = numeroVisiteEffettuate;
	}

	public ArrayList<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(ArrayList<Paziente> pazienti) {
		this.pazienti = pazienti;
	}

	private String specializzazione;
	private int numeroVisiteEffettuate;
	private ArrayList<Paziente> pazienti = new ArrayList<Paziente>();
	private ArrayList<Paziente> paz = new ArrayList<Paziente>();
	
	public void visita() {
		// L'utente crea il paziente
		String c, s = null;
		int i;
		ArrayList<String> l = new ArrayList<String>();
		System.out.println("Crea il nuovo paziente da visitare ");
		Scanner in = new Scanner(System.in);
		System.out.println("CodiceFiscale: ");
		c = in.nextLine();
		System.out.println("Numero interventi: ");
		i = in.nextInt();
		System.out.println("cure: ");
		// while(!(s.equals("fine"))){
		/*
		 * while(s.equals("fine")){ s=in.nextLine(); l.add(s); }
		 */
		l.add("nessuna");
		l.add("seconda");
		// creo oggetto paziente con gli input inseriti
		Paziente p = new Paziente(c, i, l);
		System.out.println("paziente:" + p);
		// aggiungo il paziente alla lista e aumento il numero di visite effettuate

		paz.add(p);
		setPazienti(paz);
		System.out.println("numero di visite effettuate prima di inserire il paziente" + numeroVisiteEffettuate);
		this.numeroVisiteEffettuate = this.numeroVisiteEffettuate + 1;
		System.out.println("numero di visite effettuate dopo aver inserito il paziente" + numeroVisiteEffettuate);

	}

	public void opera(Paziente p) {
		for (Paziente p1 : paz) {
			if (p1.equals(p)) {
				System.out.println("Il paziente è presente, rimuovo il paziente e aggiorno le visiteEffettuate");
				pazienti.remove(p);
				this.numeroVisiteEffettuate = this.numeroVisiteEffettuate + 1;
			} else {
				System.out.println("nessun paziente trovato");
			}
		}
	}

	@Override
	public String toString() {
		return "MedicoSpecialista [specializzazione=" + specializzazione + ", numeroVisiteEffettuate="
				+ numeroVisiteEffettuate + ", pazienti=" + pazienti + ", toString()=" + super.toString() + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
}
