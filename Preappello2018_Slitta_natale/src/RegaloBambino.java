import java.util.GregorianCalendar;

public class RegaloBambino extends Regalo {
	
	public RegaloBambino(GregorianCalendar aDataConsegna, double aPeso, String aRegione, String aNome, int aEt�) {
		super(aDataConsegna, aPeso, aRegione);
		nome = aNome;
		et� = aEt�;
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
	public int getEt�() {
		return et�;
	}
	public void setEt�(int et�) {
		this.et� = et�;
	}





	private String nome;
	private int et�;
		
}