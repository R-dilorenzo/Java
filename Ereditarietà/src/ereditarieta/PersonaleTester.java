package ereditarieta;

/***********************************
 *                                 * 
 *  Autore File : Giuseppe Siani   *  
 *                                 *  
 ***********************************/
 
public class PersonaleTester {

	public static void main(String[] args) 
	{
	Docente doc;
	Impiegato imp;
	
	doc= new Docente ("paolo rossi",'m',"via roma 1 bologna","informatica");
	imp= new Impiegato ("paolo rossi",'m',"via roma 1 bologna","segreteria");
	
	System.out.println(doc.toString());
	System.out.println(imp.toString());
	
	doc.setIndirizzo(imp.getIndirizzo());
	System.out.println(doc.toString());
	}

}
