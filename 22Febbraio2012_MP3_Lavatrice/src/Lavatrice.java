import java.io.Serializable;
import java.util.ArrayList;


public class Lavatrice implements DispositivoSelezioneProgrammi,Serializable{

	public Lavatrice(String marca, String nome) {
		this.marca = marca;
		this.nome = nome;
		this.lista = new ArrayList<Programma>();
		this.indice=0;
		this.senso=true;}
	
	public Lavatrice(String marca, String nome, ArrayList<Programma> lista) {
		this.marca = marca;
		this.nome = nome;
		this.lista = lista;
		this.indice=0;
		this.senso=true;}
	
	public String toString(){
		return this.getClass().getName()+"MARCA: "+this.getMarca()+" NOME: "+this.getNome()
				+"PROGRAMMA SELEZIONATO: "+this.indice+"]";}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Programma> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Programma> lista) {
		this.lista = lista;
	}
	public void aggiungiProgramma(Programma p){
		lista.add(p);
	}
	public void start() {
		System.out.println(this.toString());
		System.out.println("Numero Programma Avviato: "+this.indice);}

	
	public void stop() {
		System.out.println("L'eseceuzione del programma numero: "+this.indice+" è stata interrotta");}
	
	public void  next(){
	    if(senso==true){
	        indice++;
	        System.out.println(" NUMERO PROGRAMMA SELEZIONATO: "+this.indice);
	        if(indice==lista.size()){ senso=false;}
	        }
	        else {if(senso==false)
	        indice--;
	        System.out.println(" NUMERO PROGRAMMA SELEZIONATO: "+this.indice);
            if(indice==0) senso=true;}
	    }


	private String marca;
	private String nome;
	private ArrayList<Programma> lista;
	private int indice;
	private boolean senso;
	
	
	
}
