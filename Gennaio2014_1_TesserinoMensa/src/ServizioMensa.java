import java.util.ArrayList;

public class ServizioMensa {

	public ServizioMensa() {
		this.archivio = new ArrayList<Tesserino>();
	}

	public ServizioMensa(ArrayList<Tesserino> archivio) {
		this.archivio = archivio;
	}

	public void aggiungi(Tesserino T) {
		archivio.add(T);
	}

	public boolean usaTesserino(int code) throws TesserinoScadutoExeception, SaldoInsufficienteException {
		for (int i = 0; i < archivio.size(); i++)
			if (archivio.get(i).getCodice() == code) {
				somma += this.archivio.get(i).paga();
				return true;
			}
		return false;
	}

	public double calcolaTotale() {
		return this.somma;
	}

	private ArrayList<Tesserino> archivio;
	private double somma;
}
