import java.io.Serializable;


public class Canzone implements Serializable {

	public Canzone(String nome){
		this.nome=nome;}
	
	public String getNome() {
		return nome;}

	public void setNome(String nome) {
		this.nome = nome;}

	private String nome;
}
