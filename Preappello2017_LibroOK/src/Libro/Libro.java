package Libro;

import java.util.ArrayList;


public class Libro {
	private String titolo;
	private String autore;
	private int pagine;
	private ArrayList<String> capitoli;
	private int id;
	private static int ID=0;
	
	
	public Libro() {
		this.titolo="Sconosciuto";
		this.autore="Sconosciuto";
		this.pagine=0;
		this.capitoli=null;
		id=0;
	}
	
	public Libro(String titolo,int pagine,ArrayList<String> capitoli) {
		this.titolo=titolo;
		this.pagine=pagine;
		this.capitoli=capitoli;
		this.autore="Sconosciuto";
		this.id=ID++;
	}
	
	public Libro(String titolo,int pagine,ArrayList<String>capitoli,String autore) {
		this.titolo=titolo;
		this.pagine=pagine;
		this.capitoli=capitoli;
		this.autore=autore;
		this.id=ID++;
	}
	
	/*
	 * • Il metodo equals, che verifica se due libri hanno stesso autore, stesso titolo,
	 *  stesso numero di pagine e stessa lista di capitoli  
	 */
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else{
			if(obj.getClass()!=this.getClass()) return false;
			else{
				Libro lib=(Libro) obj;
				if(lib.autore==this.autore && lib.titolo==this.autore && lib.pagine==this.pagine && (ArrayList<String>)lib.capitoli==(ArrayList<String>)this.capitoli )
				return true;
				else return false;
			}
			
		}
	}

	/*
	 * • Il metodo toString 
	 */
	@Override
	public String toString() {
		return this.getClass().getName()+"[ID: "+this.getId()+" Autore: "+this.getAutore() +" Titolo: "+this.getTitolo() +" Numero di pagine: "+this.getPagine()+" Capitoli: "+this.getCapitoli()+"]\n";
	}

	
	public String getIniziali() {
		String toReturn="";
		if(autore != "Sconosciuto" && autore != null) {
			String [] splittaggio=getAutore().split(" ");//riempie arrayString delle parole senza spazi
			
			for(int i=0; i < splittaggio.length ; i++) {
				toReturn += splittaggio[i].substring(0, 1);
			}
		}
		return toReturn;
	}
	/*
	 *Il metodo getInitials che restituisce le iniziali del nome e cognome dell’autore, se questo
	 * è noto (cioè se non è uguale a “Sconosciuto” o a null). Si supponga che al più vi possono
	 *  essere due nomi e un cognome.  
	 */
	public String getInitials() {
		if(this.autore!="Sconosciuto") {
			String autore=getAutore();
			autore.split(" +");
			autore=autore.substring(0, 1);
			autore=(autore.substring(0,1)).toUpperCase()+autore.substring(1); //to.upperCase sulla prima lettera
			return autore;
		}
		
		return autore;
	}

	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public ArrayList<String> getCapitoli() {
		return capitoli;
	}
	public void setCapitoli(ArrayList<String> capitoli) {
		this.capitoli = capitoli;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
