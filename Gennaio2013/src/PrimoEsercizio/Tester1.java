package PrimoEsercizio;

public class Tester1 {


	public static void main(String[] args) {
		Indirizzo ind1=new Indirizzo("Appia",6,"Benevento");
		Indirizzo ind2=new Indirizzo("Appia",7,"Benevento");
		Indirizzo ind3=new Indirizzo("Appia",6,"Benevento");
		Indirizzo cloned=(Indirizzo) ind1.clone();
        System.out.println(ind1.toString()+"\n"+ind2.toString()+"\n"+ind1.equals(ind2)+
				"\n"+ind3.toString()+"\n"+ind1.equals(ind3));
		System.out.println("CLONAZIONE EFFETTUATA"+cloned.toString()+"\n"+ind1.equals(cloned)
				+"\n"+ind2.equals(cloned));
		
		Spedizione sped1=new Spedizione(5,ind1);
		Spedizione sped2=new Spedizione(6,ind1);
			System.out.println(sped1.toString()+"\n"+sped2.toString()+"\n"+sped1.equals(sped2));
		Spedizione sped3=new Spedizione(6,ind1);
		System.out.println(sped3.toString()+"\n"+sped2.equals(sped3));
		Spedizione sped4=new Spedizione(6,ind2);
		System.out.println(sped4.toString()+"\n"+sped2.equals(sped4));
		System.out.println(sped3.toString()+"\n"+sped2.equals(sped3));		
        Spedizione sped5=new Spedizione(5,ind3);
        System.out.println(sped5.equals(sped1)); // nonostante gli oggetti indirizzo sono diversi perchè
        // a sped5 è ind3 mentre a sped1 è ind1 i due oggetti sono uguali perchè gli attributi degli indirizzi sono guali
        
        SpedizioneConDitta speD=new SpedizioneConDitta("Amazon",5,ind1);
        SpedizioneConDitta speD2=new SpedizioneConDitta("Amazon",5,ind1);
        System.out.println(speD.toString()+"\n"+speD2.toString()+"\n"+speD.equals(speD2));


		

		

	}

}
