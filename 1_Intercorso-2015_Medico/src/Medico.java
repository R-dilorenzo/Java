
public abstract class Medico {
	
	private int codiceIdentificativo;
	private String nome;
	private String cognome;
	public int getCodiceIdentificativo() {
		return codiceIdentificativo;
	}
	public void setCodiceIdentificativo(int codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
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
	
	public Medico(int codiceIdentificativo, String nome, String cognome) {
		this.codiceIdentificativo = codiceIdentificativo;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public abstract void visita();
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	

}
