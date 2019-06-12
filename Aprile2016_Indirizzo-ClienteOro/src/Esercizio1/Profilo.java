package Esercizio1;

import java.io.Serializable;



public class Profilo implements Cloneable,Serializable
{
	
	public Profilo(String d)
	{
		descrizione = d;
	}
	
	public String getDescrizione()
	{
		return descrizione;
	}
	
	public String toString(){
		return getClass().getName()+"[DESCRIZIONE: "+this.getDescrizione()+"]";}
	
	public boolean equals(Object other){
		if(other==null) return false;
		if(other.getClass()!=this.getClass())return false;
		Profilo prof=(Profilo)other;
		return prof.descrizione.equals(this.descrizione);}
	
	public Object clone(){
		try{
			Profilo cloned=(Profilo) super.clone();
			cloned.descrizione=this.descrizione;
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
		
	}

	
	private transient String descrizione;
}

