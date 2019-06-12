import java.io.Serializable;


public class ClienteOro  extends Cliente implements Serializable{
	
	
	
	
	

	public ClienteOro(String nome, int id, String indirizzo, int numero,
			int sconto)throws ScontoNotSupportedException {
	     super(nome, id, indirizzo, numero, sconto);
		if(!(sconto>=10 && sconto<=20)) throw new ScontoNotSupportedException ();}
	
	public double calcolaPrezzo(int importo){
		if(bonus>0)
			importo -=bonus;
		return importo-(importo*this.getSconto()/100);
	}
	public int getBonus(){
		return this.bonus;	
		}

	public String toString(){
		return super.toString()+"Bonus:"+this.getBonus()+"]";}
	
	public boolean equals(Object other){
		if(!(super.equals(other))) return false;
		if(other==null) return false;
		else 
			if(other.getClass()!=this.getClass()) return false;
			else{
				ClienteOro cliente=(ClienteOro) other;
			     return this.bonus==cliente.bonus;
			}
				
		
	}
	
	public Object clone (){
		ClienteOro cloned=(ClienteOro)super.clone();
		cloned.bonus=this.bonus;
		return cloned;
	}
	
	
	private int bonus=100;

}
