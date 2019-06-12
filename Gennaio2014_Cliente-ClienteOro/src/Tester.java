
public class Tester {

	
	public static void main(String[] args) throws ScontoNotSupportedException {
		
		Cliente cliente2=new Cliente("Alessandro",1,"Via Appia",10,10);
		Cliente cliente3=(Cliente) cliente2.clone();	
		System.out.println(cliente2.equals(cliente3));	
		ClienteOro cliente=new ClienteOro("Alessandra",1,"Via Appia",10,10);
		System.out.println(cliente.calcolaPrezzo(200));
		ClienteOro cliente4=new ClienteOro("Alessandro",1,"Via Appia",10,10);
		System.out.println(cliente.equals(cliente4));

		

	
	}

}
