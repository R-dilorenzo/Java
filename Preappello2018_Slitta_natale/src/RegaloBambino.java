import java.util.GregorianCalendar;

public class RegaloBambino extends Regalo {
	
	public RegaloBambino(GregorianCalendar aDataConsegna, double aPeso, String aRegione, String aNome, int aEtà) {
		super(aDataConsegna, aPeso, aRegione);
		nome = aNome;
		età = aEtà;
	}
	
	

	
	



	@Override
	public String toString() {
		return super.toString() + "HoHoHo Ho un Regalo Per Te: " + nome  + "\n";
	}








	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}





	private String nome;
	private int età;
		
}