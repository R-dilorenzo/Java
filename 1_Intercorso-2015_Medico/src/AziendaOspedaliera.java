import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//La classe AziendaOspedaliera tiene traccia di un insieme di medici.
public class AziendaOspedaliera {
	
	private ArrayList<Medico> medLis=new ArrayList<>();

	public AziendaOspedaliera() { }
	
	//• aggiungiMedico aggiunge un medico all’azienda. 
	private void aggiungiMedico(Medico m) {
		boolean tmp=false;
		//aereom.add(a);
		for(Medico listaMed: medLis) {
			if(m.equals(listaMed)) {
				tmp=true;
				System.out.println("Medico presente");
				
			}
		}
		if(tmp==false) {
			System.out.println("Medico non era presente");
			medLis.add(m);
		}
	}
	
	//NON VA BENE
	private void medicoMaxVisite() {
		for(Medico listaMed: medLis) {
			Collections.max(medLis, Comparator.comparing(s -> s.getCodiceIdentificativo()));
		}
	}
}
