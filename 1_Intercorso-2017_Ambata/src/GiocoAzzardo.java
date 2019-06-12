import java.util.Random;


public abstract class GiocoAzzardo {
	private Random r;
	private double costo;
	
	public GiocoAzzardo(double costo){
		r =new Random();
		this.costo = costo;
	}
	
	public Random generatore(){
		return r;
	}
	public double getCosto() {
		return costo;
	}
	
	public abstract boolean gioca();
	public abstract double dammiVincita();

	
}
