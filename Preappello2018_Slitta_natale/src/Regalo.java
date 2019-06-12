import java.util.GregorianCalendar;



public class Regalo {
	public Regalo() {}

	public Regalo(GregorianCalendar aDataConsegna, double aPeso, String aRegione) {
		dataConsegna = aDataConsegna;
		peso = aPeso;
		regione = aRegione;
	}

	public int calcolaCosto() {
		if (regione == "Nord") {
			prezzo = 10;

		} else if (regione == "Centro") {
			prezzo = 15;
		} else if (regione == "Sud") {
			prezzo = 20;
		}
		
		return prezzo;
	}
	
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	


	public GregorianCalendar getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(GregorianCalendar dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}








	@Override
	public String toString() {
		return "Arrivano i regali: [regione=" + regione +  "] ";
	}








	private GregorianCalendar dataConsegna;
	private double peso;
	private String regione;
	private int prezzo;

}