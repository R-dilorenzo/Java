package Esercizio1;

import java.util.ArrayList;

public class CorsoDiFormazione {

	
	public CorsoDiFormazione(String titolo, int numeroMassimo,
			ArrayList<Studente> listaStudenti, double costoIscrizione) {
		this.titolo = titolo;
		this.numeroMassimo = numeroMassimo;
		this.listaStudenti = listaStudenti;
	    this.costoIscrizione = costoIscrizione;}
	
	public CorsoDiFormazione(String titolo, int numeroMassimo, double costoIscrizione) {
		this.titolo = titolo;
		this.numeroMassimo = numeroMassimo;
		this.listaStudenti = new ArrayList<Studente>();
	    this.costoIscrizione = costoIscrizione;}
	
	
	public String getTitolo() {
		return titolo;}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;}
	
	public int getNumeroMassimo() {
		return numeroMassimo;}
	
	public void setNumeroMassimo(int numeroMassimo) {
		this.numeroMassimo = numeroMassimo;}
	
	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;}
	
	public void setListaStudenti(ArrayList<Studente> listaStudenti) {
		this.listaStudenti = listaStudenti;}
	
	


	public double getCostoIscrizione() {
		return costoIscrizione;
	}


	public void setCostoIscrizione(double costoIscrizione) {
		this.costoIscrizione = costoIscrizione;
	}


	public void iscrizioneStudente(Studente stud){
		if(listaStudenti.size()<numeroMassimo)
		listaStudenti.add(stud);
		// da aggiungere eventuale exception
		else System.out.println("Numero massimo di iscritti raggiunto");
	}
	
	
	
	private String titolo;
	private int numeroMassimo;
	private ArrayList<Studente> listaStudenti;
	private double costoIscrizione;
}
