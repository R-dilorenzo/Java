import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MedicoGenerico extends Medico {

	public MedicoGenerico(int codiceIdentificativo, String nome, String cognome, int numeroVisiteEffettuate,
			ArrayList<Paziente> pazienti) {
		super(codiceIdentificativo, nome, cognome);
		this.numeroVisiteEffettuate = numeroVisiteEffettuate;
		this.pazienti = pazienti;
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
	private int numeroVisiteEffettuate;
	private ArrayList<Paziente> pazienti = new ArrayList<Paziente>();
	
	@Override
	public void visita() {
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
		System.out.println("aggiungo la cura");
		RandomCure();
		l.addAll(getListaCure1());
		System.out.println("paziente dopo la visita"+p);
		
	}

	ArrayList<String> listaCure=new ArrayList<>();
	ArrayList<String> listaCure1=new ArrayList<>();
	public ArrayList<String> getListaCure1() {
		return listaCure1;
	}
	public void setListaCure1(ArrayList<String> listaCure1) {
		this.listaCure1 = listaCure1;
	}
	public ArrayList<String> getListaCure() {
		return listaCure;
	}
	public void setListaCure(ArrayList<String> listaCure) {
		this.listaCure = listaCure;
	}
	public void RandomCure() {
		listaCure.add("Antibiotici");
		listaCure.add("Riposo");
		listaCure.add("Cortisonici");
		listaCure.add("Ricovero");
		listaCure.add("Riabilitazione");
		listaCure.add("Intervento");
		Random rnd = new Random();
		for (int i = 0; i < 1; i++) {
			int casuale = rnd.nextInt(6);
			listaCure1.add(getListaCure().get(casuale));
		}
		System.out.println("la cura scelta è"+getListaCure1());
	}
	

}
