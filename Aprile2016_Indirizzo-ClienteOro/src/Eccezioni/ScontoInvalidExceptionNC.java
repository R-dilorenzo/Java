package Eccezioni;

public class ScontoInvalidExceptionNC extends IllegalArgumentException {

	public ScontoInvalidExceptionNC(){
		System.out.println("Percentuale di sconto non valida");
	}
}
