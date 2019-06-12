import java.util.GregorianCalendar;

public class RegaloAdulto extends Regalo {
	
	public RegaloAdulto(GregorianCalendar aDataConsegna, double aPeso, String aRegione, String aMittente ) {
		super(aDataConsegna, aPeso, aRegione);
		mittente = aMittente;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "mittente=" + mittente  + "\n";
	}



	public String getMittente() {
		return mittente;
	}



	public void setMittente(String mittente) {
		this.mittente = mittente;
	}



	private String mittente;

}