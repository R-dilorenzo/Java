import java.util.ArrayList;


public class Cliente {

	public Cliente(String cf, double saldoIniziale){
		codiceFiscale = cf;
		saldo = saldoIniziale;
		lista = new ArrayList<GiocoAzzardo>();
	}
	
	public boolean acquistaGioco(GiocoAzzardo g){
		if(g.getCosto()>saldo)
			return false;
		saldo -= g.getCosto();
		lista.add(g);
		return true;
	}
	
	public String toString(){
		return "CF: "+codiceFiscale + "  saldo: " + saldo;
	}
	
	public String gioca() {
		String s="";
		for(GiocoAzzardo a:lista){
			s +=a+"\n";
			if(a.gioca())
				saldo +=a.dammiVincita();
		}
		return s;
	}
	
	private String codiceFiscale;
	private ArrayList<GiocoAzzardo> lista;
	private double saldo;

	
}
