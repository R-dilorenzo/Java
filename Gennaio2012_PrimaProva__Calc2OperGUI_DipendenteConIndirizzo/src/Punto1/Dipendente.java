package Punto1;

public class Dipendente implements Cloneable {

	
	
	public Dipendente(String nome, String cognome, Indirizzo indirizzo) {
		this.nome=nome;
		this.cognome = cognome;
		this.indirizzo = (Indirizzo) indirizzo.clone();
		this.id=ID++;}
	
	
	public String getNome() {
		return nome;}


	public void setNome(String nome) {
		this.nome = nome;}


	public String getCognome() {
		return cognome;}


	public void setCognome(String cognome) {
		this.cognome = cognome;}


	public Indirizzo getIndirizzo() {
		return indirizzo;}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;}


	
	
	public int getid(){
		return this.id;
	}
	
	public String toString(){
		return this.getClass().getName()+"[Nome: "+this.getNome() +"Cognome: "+this.getCognome() +"Id: "+this.id +"Indirizzo: "+this.getIndirizzo()+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		else{
			if(other.getClass()!=this.getClass()) return false;
			else{
				Dipendente dip=(Dipendente) other;
				if(dip.nome==this.nome && dip.cognome==this.cognome && dip.id==this.id && (this.indirizzo.equals(dip.indirizzo)) )
				return true;
				else return false;
			}
			
		}
		}
	
	public Object clone(){
		try{
			Dipendente cloned=(Dipendente) super.clone();
		    cloned.nome=nome;
		    cloned.cognome=cognome;
		    cloned.indirizzo=(Indirizzo)indirizzo.clone();
		    cloned.id=id;
		    return cloned;
		}catch(CloneNotSupportedException e){ return null;}
		
		
	}
	private String nome;
	private String cognome;
	private int id; 
	private Indirizzo indirizzo;
	private static int ID=0;
}
