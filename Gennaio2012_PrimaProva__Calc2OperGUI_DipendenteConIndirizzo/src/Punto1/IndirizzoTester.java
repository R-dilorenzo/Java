package Punto1;
public class IndirizzoTester {


	public static void main(String[] args) {
		Indirizzo indirizzo1=new Indirizzo("Appia",6,"Benevento",82100);
		Indirizzo indirizzo2=new Indirizzo("Appia",6,"Benevento",82100);
		System.out.println("PRIMO INDIRIZZO\n"+indirizzo1.toString());
		System.out.println("SECONDO INDIRIZZO\n"+indirizzo2.toString());
		System.out.println("CONFRONTIAMO I DUE INDIRIZZI,IL RISULTATO CORRETTO E' TRUE");
		System.out.println(indirizzo1.equals(indirizzo2));
		System.out.println("CREIAMO UN ALTRO INDIRIZZO UGUALE AL PRIMO");
		Indirizzo clonato=(Indirizzo) indirizzo1.clone();
		System.out.println("INDIRIZZO CLONATO\n"+clonato.toString());
		System.out.println("CONFRONTIAMO I DUE INDIRIZZI,IL RISULTATO CORRETTO E' TRUE");
		System.out.println(indirizzo1.equals(clonato));
		System.out.println("CREO UN TERZO INDIRIZZO DIVERSO DAI PRECEDENTI");
		Indirizzo indirizzo3=new Indirizzo("CosimoNuzzolo",6,"Benevento",82100);
		System.out.println("TERZO INDIRIZZO\n"+indirizzo3.toString());
		System.out.println("CONFRONTIAMO I DUE INDIRIZZI,IL RISULTATO CORRETTO E' FALSE");
		System.out.println(indirizzo1.equals(indirizzo3));
		System.out.println("CREIAMO UN ALTRO INDIRIZZO UGUALE AL TERZO");
		Indirizzo clonato2=(Indirizzo) indirizzo3.clone();
		System.out.println("INDIRIZZO CLONATO DAL TERZO\n"+clonato2.toString());
		System.out.println("CONFRONTIAMO I DUE INDIRIZZI,IL RISULTATO CORRETTO E' TRUE");
		System.out.println(indirizzo3.equals(clonato2));










	}

}
