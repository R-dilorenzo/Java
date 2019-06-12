package Esercizio1;

import java.io.Serializable;

import Eccezioni.ScontoInvalidException;

public class ClienteOro extends Cliente implements Serializable{

	
	public ClienteOro(String nome, int id, Indirizzo indirizzo,
			int percentualeDiSconto, Profilo profilo) throws ScontoInvalidException {
		super(nome, id, indirizzo, percentualeDiSconto);
		this.profilo = profilo;
		if(percentualeDiSconto<10 | percentualeDiSconto>20) throw new ScontoInvalidException();}
	
	
	public int getBonus() {
		return bonus;
	}
	
	public Profilo getProfilo() {
		return profilo;
	}
	public void setProfilo(Profilo profilo) {
		this.profilo = profilo;
	}


	private int bonus=100;
	private Profilo profilo;

	public double calcolaPrezzo(double importo) {
		if(importo>=bonus)
		importo -=bonus;
		return importo-(importo*this.getPercentualeDiSconto()/100);}
	
	public String toString(){
		return super.toString()+"[BONUS: "+this.bonus+"PROFILO: "+this.profilo.toString()+"]";}
	
	
	public boolean equals(Object other){
		if(!(super.equals(other))) return false;
		ClienteOro c=(ClienteOro) other;
		return c.bonus==this.bonus && c.profilo.equals(this.profilo);}
	
	public Object clone(){
		ClienteOro cloned=(ClienteOro)super.clone();
		cloned.bonus=this.bonus;
		cloned.profilo=(Profilo)this.profilo.clone();
		return cloned;
		
	}
}
