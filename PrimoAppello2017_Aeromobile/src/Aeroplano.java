import java.util.ArrayList;

public class Aeroplano extends Aeromobile {
	
	private String modello;
	private String codiceVolo;
	private ArrayList<String> rotta;
	private  int oreVolo;
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Aeroplano [modello=" + modello + ", codiceVolo=" + codiceVolo + ", rotta=" + rotta + ", oreVolo="
				+ oreVolo + ", toString()=" + super.toString() + "]";
	}
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getCodiceVolo() {
		return codiceVolo;
	}
	public void setCodiceVolo(String codiceVolo) {
		this.codiceVolo = codiceVolo;
	}
	public ArrayList<String> getRotta() {
		return rotta;
	}
	public void setRotta(ArrayList<String> rotta) {
		this.rotta = rotta;
	}
	public int getOreVolo() {
		return oreVolo;
	}
	public void setOreVolo(int oreVolo) {
		this.oreVolo = oreVolo;
	}

}
