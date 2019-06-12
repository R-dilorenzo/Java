
public abstract class Tesserino {

	
	public Tesserino(int codice, String nome, String cognome) {
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		this.attiva =true;}
	
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public boolean isAttiva() {
		return attiva;
	}
	public void setAttiva(boolean attiva) {
		this.attiva = attiva;
	}

	public void attiva(){
		if(this.attiva==true) throw new RuntimeException();
		else this.attiva=true;}
	
	public void disattiva(){
		if(this.attiva==false) throw new RuntimeException();
		else this.attiva=false;}
	
	public abstract double paga()throws TesserinoScadutoExeception,SaldoInsufficienteException;
	
	
	
	private int codice;
	private String nome;
	private String cognome;
	private boolean attiva;
	
}
