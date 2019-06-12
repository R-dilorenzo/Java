package Esercizio1;

import java.io.Serializable;



public class Indirizzo implements Cloneable,Serializable
{
	public Indirizzo(String add, int c)
	{
		strada = add;
		civico = c;
	}
	
	public String getStrada()
	{
		return strada;
	}
	
	public int getCivico()
	{
		return civico;
	}
	
	public void setStrada(String newStrada)
	{
		strada = newStrada;
	}
	
	public void setCivico(int newC)
	{
		civico = newC;
	}
	
	public String toString(){
		return getClass().getName()+"[STRADA: "+this.getStrada()+"NUMERO CIVICO: "+this.getCivico()+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass())return false;
		Indirizzo indirizzo=(Indirizzo) other;
		return indirizzo.strada.equals(this.strada) && indirizzo.civico==this.civico;}
	
	public Object clone(){
		try{
			Indirizzo cloned=(Indirizzo) super.clone();
			cloned.strada=this.strada;
			cloned.civico=this.civico;
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	private String strada;
	private int civico;

}

