import java.io.Serializable;
import java.util.ArrayList;

import Eccezioni.FaultException;


public class LettoreMp3 implements DispositivoSelezioneProgrammi,Serializable {

	

	
	public LettoreMp3(String nome) {		
		this.nome = nome;
		this.lista = new ArrayList<Canzone>();
		this.indice=0;}
	
	public void aggiungiCanzone(Canzone c){
		lista.add(c);
	}
	
	public void load(ArrayList<Canzone>lista){
		this.lista=lista;}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Canzone> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Canzone> lista) {
		this.lista = lista;
	}


	public void start() {
		System.out.println("NOME MP3: "+this.getNome());
		System.out.println("AVVIO DELLA CANZONE NUMERO "+this.indice);}

	
	public void stop() {
		System.out.println("INTERRUZIONE DELLA CANZONE NUMERO: "+this.indice);}
	
	public void next() throws FaultException{
		int i=(int) Math.random();
		System.out.println(i);
		if(i>4){
			throw new FaultException();
			
		}
	if(indice<lista.size()){
		indice++;
		System.out.println("CANZONE NUMERO "+this.indice+" SELEZIONATA");}
	else{
		indice=0;
		System.out.println("CANZONE NUMERO "+this.indice+" SELEZIONATA");

	}
		
	}
	
	private String nome;
	private ArrayList<Canzone> lista;
	private int indice;

}
