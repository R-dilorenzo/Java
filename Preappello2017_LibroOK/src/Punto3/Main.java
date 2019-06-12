package Punto3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    // ArrayList list
		ArrayList<String> cap =new ArrayList<String>();
		cap.add("primo");
		cap.add("secondo");

	ArrayList<Libro> al = new ArrayList<Libro>();
	  
	    Libro s = new Libro("titolo", 200, cap, "autore");
	    Libro s2 = new Libro("JAVA", 300, cap, "Deuf Vin");
	    al.add(s);
	    al.add(s2);

	    // serialization test
	    FileOutputStream fileOut = new FileOutputStream("StudentList.txt");
	    ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    out.writeObject(al);
	    out.close();
	    fileOut.close();

	    // deserialization test
	    FileInputStream fileIn = new FileInputStream("StudentList.txt");
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    ArrayList<Libro> a2 = (ArrayList<Libro>) in.readObject();
	    in.close();
	    fileIn.close();

	    System.out.println(a2.size());

	    for (Libro i : a2) {
	        System.out.println(i);
	    } // for
	    
	    
	    for (Libro i : a2) {
	      System.out.println(i.getAutore());
	    } // for
	} // main
}
