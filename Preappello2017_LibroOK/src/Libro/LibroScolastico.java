package Libro;

import java.util.ArrayList;


public class LibroScolastico extends Libro {
	private String ordine;
	private String grado;
	private String materia;
	private String cd;
	
	
	public LibroScolastico(String titolo,int pagine,ArrayList<String>capitoli,String autore,String ordine, String grado, String materia, String cd) {
		super(titolo,pagine,capitoli,autore);
		this.ordine = ordine;
		this.grado = grado;
		this.materia = materia;
		this.cd = cd;
	}
	
	public String toString() {
		return super.toString() + "ordine=" + ordine  + "grado="+grado+"materia="+materia+"cd="+cd+"\n";
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else{
			if(obj.getClass()!=this.getClass()) return false;
			else{
				LibroScolastico lb=(LibroScolastico) obj;
				if(lb.ordine==this.ordine && lb.grado==this.grado && lb.materia==this.materia && lb.cd==this.cd )
				return true;
				else return false;
			}
			
		}
	}
	
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getOrdine() {
		return ordine;
	}
	public void setOrdine(String ordine) {
		this.ordine = ordine;
	}
	
}
