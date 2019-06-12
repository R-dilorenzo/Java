public class PesoMaxSuperatoException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	
	
	public PesoMaxSuperatoException() {
		super("Peso massimo superato!");
	}
	public PesoMaxSuperatoException(String message) {
		super(message);
	}

}