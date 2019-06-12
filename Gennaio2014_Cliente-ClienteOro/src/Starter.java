import java.io.*;
import java.util.ArrayList;
public class Starter {

	public static void main(String[] args) throws  IOException, ScontoNotSupportedException, ClassNotFoundException {
		ObjectInputStream i;
		
		try{ // se il file non è presente
	i=new ObjectInputStream(new FileInputStream("file.txt"));
	
	
	
		}catch(FileNotFoundException e){
			ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("file.txt"));
			
			//5 Clienti oro
			ClienteOro cliente1=new ClienteOro("cliente1", 1, "indirizzo1", 10, 10);
			ClienteOro cliente2=new ClienteOro("cliente2", 2, "indirizzo2", 10, 10);
			ClienteOro cliente3=new ClienteOro("cliente3", 3, "indirizzo3", 10, 10);
			ClienteOro cliente4=new ClienteOro("cliente4", 4, "indirizzo4", 10, 10);
			ClienteOro cliente5=new ClienteOro("cliente5", 5, "indirizzo5", 10, 10);
			 
			//5 Clienti ordinari
			ClienteOrdinario clienteOrd1=new ClienteOrdinario("clienteOrd1", 1, "indirizzo1", 10, 5);
			ClienteOrdinario clienteOrd2=new ClienteOrdinario("clienteOrd1", 2, "indirizzo1", 10, 4);
			ClienteOrdinario clienteOrd3=new ClienteOrdinario("clienteOrd1", 3, "indirizzo1", 10, 4);
			ClienteOrdinario clienteOrd4=new ClienteOrdinario("clienteOrd1", 4, "indirizzo1", 10, 5);
			ClienteOrdinario clienteOrd5=new ClienteOrdinario("clienteOrd1", 5, "indirizzo1", 10, 5);

			//Scrittura degli oggetti(clienti oro) nel file
			o.writeObject(cliente1);
			o.writeObject(cliente2);
			o.writeObject(cliente3);
			o.writeObject(cliente4);
			o.writeObject(cliente5);
			
			o.writeObject(clienteOrd1);
			o.writeObject(clienteOrd2);
			o.writeObject(clienteOrd3);
			o.writeObject(clienteOrd4);
			o.writeObject(clienteOrd5);
		} 
		finally {
			i=new ObjectInputStream(new FileInputStream("file.txt"));
			ArrayList<ClienteOrdinario> arrayOrdinario=new ArrayList<ClienteOrdinario>(5);
			ArrayList<ClienteOro> arrayOro=new ArrayList<ClienteOro>(5);
			//Lettura dal file
			for(int in=0;in<10;in++){
			Cliente clienteLetto=(Cliente)i.readObject();
			if(clienteLetto instanceof ClienteOrdinario)
				arrayOrdinario.add((ClienteOrdinario) clienteLetto);
			else if(clienteLetto instanceof ClienteOro)
				arrayOro.add((ClienteOro) clienteLetto);
			}
		}
	
	
	}

}
