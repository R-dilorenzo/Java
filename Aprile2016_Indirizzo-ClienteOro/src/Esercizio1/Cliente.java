package Esercizio1;

import java.io.Serializable;

public abstract class Cliente implements Cloneable,Serializable{

	
	
	public Cliente(String nome, int id, Indirizzo indirizzo,
			int percentualeDiSconto) {
		this.nome = nome;
		this.id = id;
		this.indirizzo = (Indirizzo) indirizzo.clone();
		this.percentualeDiSconto = percentualeDiSconto;}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getPercentualeDiSconto() {
		return percentualeDiSconto;
	}
	public void setPercentualeDiSconto(int percentualeDiSconto) {
		this.percentualeDiSconto = percentualeDiSconto;
	}
	
	public abstract double calcolaPrezzo(double importo);

	public String toString(){
		return this.getClass().getName()+"[NOME:"+this.nome+"INDIRIZZO: "+this.getIndirizzo();}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass()) return false;
		Cliente c=(Cliente) other;
		return c.nome.equals(this.nome) && c.id==this.id && c.indirizzo.equals(this.indirizzo) 
				&& c.percentualeDiSconto==this.percentualeDiSconto;}
	
	public Object clone(){
		try{
			Cliente cloned=(Cliente) super.clone();
			cloned.nome=this.nome;
			cloned.id=this.id;
			cloned.indirizzo=this.indirizzo;
			cloned.percentualeDiSconto=this.percentualeDiSconto;
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	private String nome;
	private int id;
	private transient Indirizzo indirizzo;
	private  int percentualeDiSconto;
}
