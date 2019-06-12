package PrimoEsercizio;

public class Indirizzo implements Cloneable {

	
	public Indirizzo(String via, int nCivico, String città) {
		this.via = via;
		this.nCivico = nCivico;
		this.città = città;}
	
	public Indirizzo() {
		this.via = null;
		this.nCivico = 0;
		this.città = null;}
	
	
	public String getVia() {
		return via;}
	
	public void setVia(String via) {
		this.via = via;}
	
	public int getnCivico() {
		return nCivico;}
	
	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;}
	
	public String getCittà() {
		return città;}
	
	public void setCittà(String città) {
		this.città = città;}
	

	public String toString(){
		return getClass().getName()+"[VIA: " +this.getVia()+" NUMERO CIVICO: "+this.getnCivico()
				+" CITTA': "+this.getCittà()+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass()) return false;
		Indirizzo indirizzo=(Indirizzo) other;
		return indirizzo.via.equals(this.via) && indirizzo.nCivico==this.nCivico 
				&& indirizzo.città.equals(this.città);}
	
	public Object clone(){
		try{
			Indirizzo cloned=(Indirizzo) super.clone();
			cloned.via=this.via;
			cloned.nCivico=this.nCivico;
			cloned.città=this.città;
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	

	private String via;
	private int nCivico;
	private String città;
	
}
