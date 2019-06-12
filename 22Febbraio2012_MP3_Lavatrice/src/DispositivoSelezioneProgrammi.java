import Eccezioni.FaultException;


public interface DispositivoSelezioneProgrammi {

	void start();
	void stop();
	void next() throws FaultException;
}
