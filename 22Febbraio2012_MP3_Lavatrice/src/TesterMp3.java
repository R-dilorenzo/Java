import Eccezioni.FaultException;


public class TesterMp3 {

	public static void main(String[] args){
		Canzone c=new Canzone("Certe Notti");
		Canzone c2=new Canzone("Fix You");
		Canzone c3=new Canzone("Per Sempre");
		LettoreMp3 lettore=new LettoreMp3("Lettore Numero 1");
		lettore.aggiungiCanzone(c);
		lettore.aggiungiCanzone(c2);
		lettore.aggiungiCanzone(c3);
		lettore.start();
		int i=0;
		lettore.stop();
		try {
			lettore.next();
	        i++;
		lettore.next();
		i++;
		lettore.next();
		i++;
		lettore.start();
		lettore.stop();
		lettore.next();
		i++;
		} catch (FaultException e) {
			System.out.println("Numero di tentativi: "+i);
		}
		
		
		
	}

}

