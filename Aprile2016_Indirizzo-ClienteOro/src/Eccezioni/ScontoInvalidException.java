package Eccezioni;

public class ScontoInvalidException extends Exception {
	
	public ScontoInvalidException(String msg){
		System.out.println(msg);
	}
	
	public ScontoInvalidException(){
		System.out.println("Percentuale di sconto non valida");
	}

}
