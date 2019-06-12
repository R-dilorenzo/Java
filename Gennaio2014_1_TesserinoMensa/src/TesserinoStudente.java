import java.util.GregorianCalendar;


public class TesserinoStudente extends Tesserino{
	
	public TesserinoStudente(int codice, String nome, String cognome, String matricola, boolean bonus, char fascia,
			GregorianCalendar data) {
		super(codice, nome, cognome);
		this.matricola = matricola;
		this.bonus = bonus;
		this.fascia = fascia;
		this.data = data;}
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public boolean isBonus() {
		return bonus;
	}
	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	public char getFascia() {
		return fascia;
	}
	public void setFascia(char fascia) {
		this.fascia = fascia;
	}
	public GregorianCalendar getData() {
		return data;
	}
	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public double calcolaPrezzo(){
		if(fascia=='A'){
			if(this.isBonus()==true) return 2.00;
			else return 3.00;}
		else if(fascia=='B'){
			if(this.isBonus()==true) return 1.00;
			else return 2.00;}
		return 3.00;}
	
	public double paga() throws TesserinoScadutoExeception,SaldoInsufficienteException{
		if(!(data.before(new GregorianCalendar()) ) ) throw new TesserinoScadutoExeception();
		if(this.saldo<this.calcolaPrezzo()) throw new SaldoInsufficienteException(); 
		else this.saldo -=calcolaPrezzo();
		return calcolaPrezzo();}
	
	public void versa(double ammonto){
		if(ammonto<0) throw new RuntimeException();
		else this.saldo +=ammonto;}
	
	
	
	private String matricola;
	private boolean bonus;
	private char fascia;
	private GregorianCalendar data;
	private double saldo;

	

}
