package PrimoEsercizio;

public class Spedizione implements Cloneable {

	public Spedizione(int nGiorni){
		this.nGiorni=nGiorni;
		this.indirizzo=new Indirizzo();}
	
	public Spedizione(int nGiorni,String via, int nCivico, String città){
		this.nGiorni=nGiorni;
		this.indirizzo=new Indirizzo(via,nCivico,città);}
	
	public Spedizione(int nGiorni,Indirizzo indirizzo){
		this.nGiorni=nGiorni;
		this.indirizzo=indirizzo;}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getnGiorni() {
		return nGiorni;
	}

	public void setnGiorni(int nGiorni) {
		this.nGiorni = nGiorni;
	}

	public String toString(){
		return getClass().getName()+ "[INDIRIZZO: "+this.indirizzo.toString()+"NUMERO DI GIORNI: "+this.nGiorni+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass()) return false;
		Spedizione spedito=(Spedizione) other;
		return spedito.indirizzo.equals(this.indirizzo) && spedito.nGiorni==this.nGiorni;}
	
	public Object clone(){
		try{
		Spedizione cloned=(Spedizione) super.clone();
		cloned.indirizzo=(Indirizzo) this.indirizzo.clone();
		cloned.nGiorni=this.nGiorni;
		return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	private Indirizzo indirizzo;
	private int nGiorni;
}
