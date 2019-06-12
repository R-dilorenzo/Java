import java.util.ArrayList;
import java.util.GregorianCalendar;



public class SlittaDiBabboNatale {

	public SlittaDiBabboNatale(double aPesoMassimo) {
		pesoMassimo = aPesoMassimo;

	}

	public double getPesoMassimo() {
		return pesoMassimo;
	}

	public void setPesoMassimo(double pesoMassimo) {
		this.pesoMassimo = pesoMassimo;
	}

	public void aggiungiRegalo(Regalo reg){
		if (reg.getPeso() > pesoMassimo) {
			throw new PesoMaxSuperatoException();
		} else {
			lista.add(reg);
			pesoMassimo = pesoMassimo - reg.getPeso();
		}
	}

	public double calcolaCosto() {
		for (Regalo regalo : lista) {
			prezzo = prezzo + regalo.calcolaCosto();
		}
		return prezzo;
	}
	

	
	public String spedisci() {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		GregorianCalendar dataDomani = new GregorianCalendar();
		GregorianCalendar dataDpDomani = new GregorianCalendar();
		
		/*int anno = dataAttuale.get(GregorianCalendar.YEAR);
		int mese = dataAttuale.get(GregorianCalendar.MONTH) + 1;
		int giorno = dataAttuale.get(GregorianCalendar.DAY_OF_MONTH);*/
		
		dataDomani.add(GregorianCalendar.DAY_OF_YEAR, 1);
		dataDpDomani.add(GregorianCalendar.DAY_OF_YEAR, 2);
		String toReturnNord = "";
		String toReturnCentro = "";
		String toReturnSud = "";
	
		
		for (Regalo regalo : lista) {
			
			if(regalo.getRegione()=="Nord") {
				regalo.setDataConsegna(dataAttuale);
				toReturnNord +=regalo.toString();
				
			} else if(regalo.getRegione()=="Centro") {
				regalo.setDataConsegna(dataDomani);
				toReturnCentro +=regalo.toString();
			}else if(regalo.getRegione()=="Sud") {
				regalo.setDataConsegna(dataDpDomani);
				toReturnSud +=regalo.toString();
			}
		}
		return toReturnNord + toReturnCentro + toReturnSud;
	}
	
	
	private double prezzo;
	private double pesoMassimo;
	private ArrayList<Regalo> lista = new ArrayList<>();
}