
public class TesserinoPersonale extends Tesserino {
	
	public TesserinoPersonale(int codice, String nome, String cognome,
			 String facoltà, double sommaSpesa, String categoria) {
		super(codice, nome, cognome);
		this.facoltà = facoltà;
		this.sommaSpesa = sommaSpesa;
		this.categoria = categoria;}
	
	public String getFacoltà() {
		return facoltà;
	}
	public void setFacoltà(String facoltà) {
		this.facoltà = facoltà;
	}
	public double getSommaSpesa() {
		return sommaSpesa;
	}
	public void setSommaSpesa(double sommaSpesa) {
		this.sommaSpesa = sommaSpesa;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double paga(){
		if(categoria.equals("docente")) {
			this.sommaSpesa +=5.60;
			return 5.60;}
		else if(categoria.equals("amministrativo")){
			this.sommaSpesa +=4.00;
			return 4.00;}
		return 0.00;}
	
	private void cambiaCategoria(){
		if(categoria.equals("docente"))
			this.categoria="amministrativo";
		else if(categoria.equals("amministrativo"))
			this.categoria="docente";}
	
	
	private String facoltà;
	private double sommaSpesa;
	private String categoria;
	
	

}
