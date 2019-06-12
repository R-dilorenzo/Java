
public class Tester {

	
	public static void main(String[] args) {
		Programma lana=new Programma("lana");
		Programma seta=new Programma("seta");
		Programma cotone=new Programma("cotone");
		Lavatrice lava=new Lavatrice("Index","MiaLavatrice");
		lava.aggiungiProgramma(lana);
		lava.aggiungiProgramma(seta);
		lava.aggiungiProgramma(cotone);
		lava.start();
		lava.next();
		lava.stop();
		lava.next();
		lava.next();
		lava.next();
		lava.next();
	}

}
