package PrimoEsercizio;

public class Indirizzo implements Cloneable {

	
	public Indirizzo(String via, int nCivico, String citt�) {
		this.via = via;
		this.nCivico = nCivico;
		this.citt� = citt�;}
	
	public Indirizzo() {
		this.via = null;
		this.nCivico = 0;
		this.citt� = null;}
	
	
	public String getVia() {
		return via;}
	
	public void setVia(String via) {
		this.via = via;}
	
	public int getnCivico() {
		return nCivico;}
	
	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;}
	
	public String getCitt�() {
		return citt�;}
	
	public void setCitt�(String citt�) {
		this.citt� = citt�;}
	

	public String toString(){
		return getClass().getName()+"[VIA: " +this.getVia()+" NUMERO CIVICO: "+this.getnCivico()
				+" CITTA': "+this.getCitt�()+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass()) return false;
		Indirizzo indirizzo=(Indirizzo) other;
		return indirizzo.via.equals(this.via) && indirizzo.nCivico==this.nCivico 
				&& indirizzo.citt�.equals(this.citt�);}
	
	public Object clone(){
		try{
			Indirizzo cloned=(Indirizzo) super.clone();
			cloned.via=this.via;
			cloned.nCivico=this.nCivico;
			cloned.citt�=this.citt�;
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	

	private String via;
	private int nCivico;
	private String citt�;
	
}
