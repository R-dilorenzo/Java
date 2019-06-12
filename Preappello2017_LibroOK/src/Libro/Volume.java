package Libro;

import java.util.ArrayList;

public class Volume extends Libro {

	private String titoloEnciclopedia;
	private String curatore;
	
	public Volume(String titolo,int pagine,ArrayList<String>capitoli,String autore,String titoloEnciclopedia,String curatore) {
		super(titolo,pagine,capitoli,autore);
		this.setTitoloEnciclopedia(titolo);
		this.curatore=curatore;
	}
	
	public String toString() {
		return super.toString() + "Titolo Enciclopedia=" + titoloEnciclopedia  + "curatore"+curatore+"\n";
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else{
			if(obj.getClass()!=this.getClass()) return false;
			else{
				Volume vol=(Volume) obj;
				if(vol.titoloEnciclopedia==this.titoloEnciclopedia && vol.curatore==this.curatore )
				return true;
				else return false;
			}
			
		}
	}
	
	public String getCuratore() {
		return curatore;
	}
	public void setCuratore(String curatore) {
		this.curatore = curatore;
	}


	public String getTitoloEnciclopedia() {
		return titoloEnciclopedia;
	}


	public void setTitoloEnciclopedia(String titoloEnciclopedia) {
		this.titoloEnciclopedia = titoloEnciclopedia;
	}
	
}
