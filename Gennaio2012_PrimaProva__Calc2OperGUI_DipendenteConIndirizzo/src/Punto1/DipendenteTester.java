package Punto1;

public class DipendenteTester {

	
	public static void main(String[] args) {
	
		Indirizzo indirizzo=new Indirizzo("Appia",6,"Benevento",82100);
		System.out.println("CREO IL PRIMO DIPENDENTE");
		Dipendente dip1=new Dipendente("Alessandra","Zullo",indirizzo);
		System.out.println("VERIFICO LE INFORMAZIONI RELATIVE AD ESSO\n"+dip1.toString());
		System.out.println("CREO IL SECONDO DIPENDENTE");
		Dipendente dip2=new Dipendente("Alessandra","Zullo",indirizzo);
		System.out.println("VERIFICO LE INFORMAZIONI RELATIVE AD ESSO\n"+dip2.toString());
		System.out.println("VERIFICO CHE I DUE DIPENDENTE SIANO DIVERSI,IL RISULTATO CORRETTO E' FALSE");
		System.out.println(dip1.equals(dip2));
		System.out.println("NONOSTANTE LE INFORMAZIONI SIANO UGUALI I DUE DIPENDENTI SONO DIVERSI PERCHE' HANNO DIVERSO ID");
		System.out.println("CREO UN DIPENDENTE UGUALE IN TUTTO AL PRIMO(LO CLONO)");
		Dipendente clonato=(Dipendente) dip1.clone();
		System.out.println("VERIFICO LE INFORMAZIONI RIGUARDANTI IL DIPENDENTE CLONATO");
		System.out.println(clonato.toString());
		System.out.println("VEDO SE IL PRIMO E IL DIP CLONATO SONO UGUALI IL RISULTATO CORRETTO E' TRUE");
		System.out.println(dip1.equals(clonato));
		System.out.println("VERIFICO SE IL SECONDO E IL DIP CLONATO SONO UGUALI IL RISULTATO CORRETTO E' FALSE(ID DIVERSO)");
		System.out.println(dip2.equals(clonato));	 
		
	}

}
