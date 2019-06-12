package Punto1;
import java.util.Scanner;

public class Tester {


	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Digita il nome,cognome del primo dipendente,via,numerocivico,città,cap");
		
		String nome=input.next();
		String cognome=input.next();
		String via=input.next();
		int ncivico=input.nextInt();
		String città=input.next();
		int cap=input.nextInt();
		Indirizzo indirizzo=new Indirizzo(via,ncivico,città,cap);
		Dipendente dip1=new Dipendente(nome,cognome,indirizzo);
		System.out.println("LE INFORMAZIONI DEL PRIMO DIPENDENTE SONO:");
		System.out.println(dip1.toString());
		System.out.println("Digita il NOME-COGNOME-VIA-NUMEROCIVICO-CITTA'-CAP del secondo dipendente");
		nome=input.next();
		 cognome=input.next();
		 via=input.next();
		 ncivico=input.nextInt();
		 città=input.next();
		 cap=input.nextInt();
		 indirizzo=new Indirizzo(via,ncivico,città,cap);
		 Dipendente dip2=new Dipendente(nome,cognome,indirizzo);
			System.out.println(dip2.toString());

		   try{
			   if(!dip2.equals(dip1))
				   throw new WrongDependentException();
			   
		   }catch(WrongDependentException e){ }


		


	} 

}
