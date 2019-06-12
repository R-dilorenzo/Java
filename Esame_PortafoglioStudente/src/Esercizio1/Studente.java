package Esercizio1;

public class Studente {

	public Studente(String nome, MezzoDiPagamento mezzo) {
		this.nome = nome;
		this.mezzo=mezzo;}
	
	
	public String getNome() {
		return nome;}
	
	public void setNome(String nome) {
		this.nome = nome;}
	
	public MezzoDiPagamento getMezzo() {
		return mezzo;}
	
	public void setMezzo(MezzoDiPagamento mezzo) {
		this.mezzo = mezzo;}

	public void iscrizione(CorsoDiFormazione corso){
		try{
			mezzo.paga(corso.getCostoIscrizione());
			corso.iscrizioneStudente(this);
		}catch(InvalidImportoException e){
			System.out.println(this.nome+ "non puoi iscriverti al corso");
		}
		
		
		
	}

	private String nome;
	private MezzoDiPagamento mezzo;
	
}
