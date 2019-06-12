package Esercizio1;

import java.io.Serializable;

import Eccezioni.ScontoInvalidException;

public class ClienteOrdinario extends Cliente implements Serializable {

	public ClienteOrdinario(String nome, int id, Indirizzo indirizzo,
			int percentualeDiSconto) throws ScontoInvalidException{
		super(nome, id, indirizzo, percentualeDiSconto);
		if(percentualeDiSconto>5) throw new ScontoInvalidException();
		}
	
	public double calcolaPrezzo(double importo){
		return importo-((importo*this.getPercentualeDiSconto())/100);}
	
	
}
