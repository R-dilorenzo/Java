import java.util.Random;


public class CartaAlta extends GiocoAzzardo{
	

	private int[] carte,banco;
	
	public CartaAlta(double costo){
		super(costo);
		carte = new int[2];
		carte[0] = generatore().nextInt(10) + 1;
		carte[1] = generatore().nextInt(10) + 1;
		banco = new int[2];
		banco[0] = generatore().nextInt(10) + 1;
		banco[1] = generatore().nextInt(10) + 1;
	}

	public boolean gioca() {
		if((carte[0]>banco[0])&&(carte[1]>banco[1]))
			return true;
		return false;
	}
	
	public String toString(){
		return "BANCO: " + banco[0] + " "+banco[1] + 
				"\nCARTE: "+ carte[0] +  " "+carte[1];
	}
	public double dammiVincita(){
		return getCosto()*5;
	}

}
