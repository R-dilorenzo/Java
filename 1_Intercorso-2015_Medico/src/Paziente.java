import java.util.ArrayList;

public class Paziente {
	private String codiceFiscale;
	private int numeroInterventiEffettuati;
	private ArrayList<String> listaCure;
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public int getNumeroInterventiEffettuati() {
		return numeroInterventiEffettuati;
	}
	public void setNumeroInterventiEffettuati(int numeroInterventiEffettuati) {
		this.numeroInterventiEffettuati = numeroInterventiEffettuati;
	}
	public ArrayList<String> getListaCure() {
		return listaCure;
	}
	public void setListaCure(ArrayList<String> listaCure) {
		this.listaCure = listaCure;
	}
	
	
	public Paziente(String codiceFiscale, int numeroInterventiEffettuati, ArrayList<String> listaCure) {
		this.codiceFiscale = codiceFiscale;
		this.numeroInterventiEffettuati = numeroInterventiEffettuati;
		this.listaCure = listaCure;
	}
	
	@Override
	public String toString() {
		return "Paziente [codiceFiscale=" + codiceFiscale + ", numeroInterventiEffettuati=" + numeroInterventiEffettuati
				+ ", listaCure=" + listaCure + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

	
}
