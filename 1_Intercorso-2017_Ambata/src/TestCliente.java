import java.util.Random;


public class TestCliente {

	public static void main(String[] args){
		Random r = new Random();
		Cliente c = new Cliente("XFG", r.nextInt(51)+50);
		for(int i=0;i<10;i++){
			if(r.nextInt(2)==0)
				c.acquistaGioco(new CartaAlta(2));
			else 
				c.acquistaGioco(new Ambata(4));
			
		}
		System.out.println("Cliente dopo l'acquisto\n "+c);
		System.out.println(c.gioca());
		System.out.println("Cliente dopo aver giocato\n "+c);
	}
}
