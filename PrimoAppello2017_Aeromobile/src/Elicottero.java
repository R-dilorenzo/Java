
public class Elicottero extends Aeromobile{
	
	private String destinazione;
	private String identificativo;
	
	
	@Override
	public String toString() {
		return "Elicottero [destinazione=" + destinazione + ", identificativo=" + identificativo + ", toString()="
				+ super.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}
	
	

}
