package Esercizio1;

public class Portafoglio extends MezzoDiPagamento{

	
	public Portafoglio(double valoreResiduo) {
		super();
		this.valoreResiduo = valoreResiduo;}

	public double getValoreResiduo() {
		return valoreResiduo;}

	public void setValoreResiduo(double valoreResiduo) {
		this.valoreResiduo = valoreResiduo;}

	public void paga(double importo) throws InvalidImportoException {
		if(importo>valoreResiduo) throw new InvalidImportoException("Importo non valido");
		valoreResiduo -=importo;
	}


	public double getSaldo() {
		return this.valoreResiduo;}
	
	public Object clone(){
		try{
			Portafoglio p=(Portafoglio)super.clone();
			p.valoreResiduo=this.valoreResiduo;
			return p;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	
	private double valoreResiduo;
	
}
