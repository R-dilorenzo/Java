package Libro;

import java.util.ArrayList;

public class Libreria {

	
	//private ArrayList<Libro> lista=new ArrayList<>();
	private ArrayList<Libro> libreria=new ArrayList<>();
	

	public Libreria() {

	}

	public void aggiungiLibro(Libro l) {
		libreria.add(l);
	}



	public void cercaLibro(String titolo) throws FaultException{
		boolean tmp=false;
		for(Libro libro : libreria) {
			if(titolo.equals(libro.getTitolo())) {
				System.out.println("libro presente");
				tmp=true;
			}
		}
		if(tmp==false) {
			throw new FaultException();
			
		}
	}
	
	@Override
	public String toString() {
		return "Libreria [" + libreria + "]";
	}

}
