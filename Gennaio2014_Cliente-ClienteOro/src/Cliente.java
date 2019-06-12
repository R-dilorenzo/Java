import java.io.Serializable;


public class Cliente implements Cloneable,Serializable {

	
	
	public Cliente(String nome, int id, String indirizzo, int numero, int sconto) {
		this.nome = nome;
		this.id = id;
		this.indirizzo = indirizzo;
		this.numero = numero;
		this.sconto = sconto;}
	
	public String getNome() {
		return nome;}
	
	public void setNome(String nome) {
		this.nome = nome;}
	
	public int getId() {
		return id;}
	
	public void setId(int id) {
		this.id = id;}
	
	public String getIndirizzo() {
		return indirizzo;}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;}
	
	public int getNumero() {
		return numero;}
	
	public void setNumero(int numero) {
		this.numero = numero;}
	
	public int getSconto() {
		return sconto;}
	
	public void setSconto(int sconto) {
		this.sconto = sconto;}

	public String toString()
	{
		return this.getClass().getName()+"[Nome:"+this.getNome()+ " Id:"+this.getIndirizzo()+" Indirizzo:"+this.getIndirizzo()+" Numero:"+this.getNumero()+" sconto:"+this.getSconto()+" ]";
	}
	public boolean equals(Object other){
		if(other==null) return false;
		else if(other.getClass()!=this.getClass()) return false;
		else{
			Cliente cliente=(Cliente) other;
		return this.nome.equals(cliente.getNome()) && this.id==cliente.id && this.indirizzo.equals(cliente.getIndirizzo()) && this.numero==cliente.getNumero() && this.sconto==cliente.getSconto();
	}
	}
	
	public Object clone(){
		
		try {
			Cliente cloned = (Cliente)super.clone();
			cloned.nome=this.nome;
		    cloned.id=this.id;
			cloned.indirizzo=this.indirizzo;
			cloned.numero=this.numero;
			cloned.sconto=this.sconto;
			return cloned;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}}
	
	private String nome;
	private int id;
	private String indirizzo;
	private int numero;
	private int sconto;
}
