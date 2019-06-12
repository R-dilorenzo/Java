import java.io.Serializable;


public class ClienteOrdinario extends Cliente implements Serializable {

	public ClienteOrdinario(String nome, int id, String indirizzo, int numero,
			int sconto) throws ScontoNotSupportedException{
		super(nome, id, indirizzo, numero, sconto);
		if(!(sconto>=0 && sconto<=5)) throw new ScontoNotSupportedException();
	}
	
	public double calcolaPrezzo(int importo){
		return importo-(importo*this.getSconto()/100);
	}
	
public Object clone(){
	ClienteOrdinario cloned=(ClienteOrdinario) super.clone();
	return cloned;
}
}
