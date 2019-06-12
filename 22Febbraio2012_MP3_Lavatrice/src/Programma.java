import java.io.Serializable;


public class Programma implements Serializable{

	
	public Programma(String nome) {
		this.nome = nome;}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;
}
