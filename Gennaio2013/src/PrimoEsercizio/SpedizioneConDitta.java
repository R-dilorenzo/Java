package PrimoEsercizio;

public class SpedizioneConDitta extends Spedizione{
	
	public SpedizioneConDitta(String nomeDitta,int nGiorni,Indirizzo indirizzo){
		super(nGiorni,indirizzo);
		this.nomeDitta=nomeDitta;}
	

	public String getNomeDitta() {
		return nomeDitta;}


	public void setNomeDitta(String nomeDitta) {
		this.nomeDitta = nomeDitta;}


	public String toString(){
		return super.toString()+"[NOME DITTA: "+this.nomeDitta+"]";}
	
	public boolean equals(Object other){
		if(!(super.equals(other))) return false;
		SpedizioneConDitta sped=(SpedizioneConDitta) other;
		return sped.nomeDitta.equals(this.nomeDitta);}
	
	public Object clone(){
		SpedizioneConDitta cloned=(SpedizioneConDitta) super.clone();
		cloned.nomeDitta=this.nomeDitta;
		return cloned;
	}
	private String nomeDitta;

	
}
