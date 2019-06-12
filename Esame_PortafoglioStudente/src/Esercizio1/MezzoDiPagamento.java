package Esercizio1;

public abstract class MezzoDiPagamento {

	public abstract void paga(double importo) throws InvalidImportoException;
	public abstract double getSaldo();


}
