import java.util.ArrayList;

public class Tester {


	public static void main(String[] args)  {
	/*
	MedicoSpecialista medico=new MedicoSpecialista(1, "nome", "cognome", "chirurgo", 2, null);
	
	System.out.println("Pazienti visitati prima del metodo visita"+medico.getPazienti());
	medico.visita();
	System.out.println("Pazienti visitati dopo del metodo visita"+medico.getPazienti());
	medico.visita();
	System.out.println("Pazienti visitati dopo del metodo visita"+medico.getPazienti());
	
	
	ArrayList<String> n=new ArrayList<>();
	n.add("nessuna");
	n.add("seconda");
	Paziente p=new Paziente("ppp",22,n);
	System.out.println("crea un paziente uguale:"+p);
	medico.opera(p);
	*/
	MedicoGenerico medGen=new MedicoGenerico(2, "medico", "generico", 4, null);
	medGen.visita();
	}
}
