package Esercizio1;

public class CartaDiCredito extends MezzoDiPagamento{

	public CartaDiCredito(double importoUtilizzato, double creditoMassimo) {
		super();
		this.importoUtilizzato = importoUtilizzato;
		this.creditoMassimo = creditoMassimo;}
	
	public double getImportoUtilizzato() {
		return importoUtilizzato;}
	
	public void setImportoUtilizzato(double importoUtilizzato) {
		this.importoUtilizzato = importoUtilizzato;}
	
	public double getCreditoMassimo() {
		return creditoMassimo;}
	
	public void setCreditoMassimo(double creditoMassimo) {
		this.creditoMassimo = creditoMassimo;}
	
	public void paga(double importo) throws InvalidImportoException {
		if(importo>(creditoMassimo-importoUtilizzato))
			throw new InvalidImportoException("Importo non valido");
		importoUtilizzato +=importo;
	}
	
	public double getSaldo() {
		return this.importoUtilizzato;
	}
	
	public Object clone(){
		try{
			CartaDiCredito carta=(CartaDiCredito)super.clone();
			carta.importoUtilizzato=this.importoUtilizzato;
			carta.creditoMassimo=this.creditoMassimo;
			return carta;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	private double importoUtilizzato;
	private double creditoMassimo;

	
		
	

}
