package Libro;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws FaultException {
		
	ArrayList<String> cap =new ArrayList<String>();
	cap.add("primo");
	cap.add("secondo");
	
	Libro l=new Libro("titolo",100,cap,"autore");
	Libreria lib= new Libreria();
	lib.aggiungiLibro(l);
	//System.out.println(lib);
	
	Libro l1=new Libro("JAVA",200,cap,"Deuf Vin");
	//Libreria lib1= new Libreria();
	//lib1.aggiungiLibro(l1);
	lib.aggiungiLibro(l1);
	//System.out.println(l1.getInitials1());
	System.out.println(lib);
	System.out.println("le iniziali dell autore del secondo libro sono sono: "+l1.getIniziali());
	
	Scanner input=new Scanner(System.in);
	System.out.println("inserisci il titolo:");
	String titolo=input.next();
	lib.cercaLibro(titolo);
	
	}
}
