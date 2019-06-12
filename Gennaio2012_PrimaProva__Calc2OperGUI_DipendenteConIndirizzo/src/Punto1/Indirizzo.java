package Punto1;

public class Indirizzo implements Cloneable{

	public Indirizzo(){
		this.via=null;
		this.nCivico=0;
		this.città=null;
		this.cap=0;}
	
	public Indirizzo(String via,int nCivico,String città,int cap){
		this.via=via;
		this.nCivico=nCivico;
		this.città=città;
		this.cap=cap;}
	
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

	public int getCap() {
		return cap;}

	public void setCap(int cap) {
		this.cap = cap;}

// Sovrascrizione metodi
	 
	public String toString(){
		return getClass().getName()+"[ Via: "+this.getVia()+" Numero Civico: "+this.getnCivico()+" Città: "+this.getCittà()+" CAP: "+this.getCap()+ " ]";}

	public boolean equals(Object other){
		if(other==null) return false;
		else{
			if(other.getClass()!=this.getClass()) return false;
			else{
				Indirizzo ind=(Indirizzo) other;
				if(ind.getCap()==this.getCap() && ind.getCittà().equals(this.getCittà()) && ind.getnCivico()==this.getnCivico() && ind.getVia().equals(this.getVia()))
				return true;
				else return false;
			}	
			
		}
		
	}
	
	public Object clone(){
		try{
			Indirizzo cloned=(Indirizzo) super.clone();
			cloned.via=this.via;
			cloned.nCivico=this.nCivico;
			cloned.città=this.città;
			cloned.cap=this.cap;
			return cloned;
		}catch(CloneNotSupportedException e){ return null;}
		
	}
	
	private String via;
	private int nCivico;
	private String città;
	private int cap;
}
