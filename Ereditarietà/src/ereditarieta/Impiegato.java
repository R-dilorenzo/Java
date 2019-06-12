package ereditarieta;

/***********************************
 *                                 * 
 *  Autore File : Giuseppe Siani   *  
 *                                 *  
 ***********************************/
 
public class Impiegato extends Dipendente
{
	private  String ufficio;

	public Impiegato (String nome, char sesso, String indirizzo,String ufficio)
	{
	super(nome,sesso,indirizzo);	
	this.ufficio=ufficio;
	}
	
	public void setUfficio(String ufficio)
	{this.ufficio=ufficio;}
	
	public String getUfficio()
	{return ufficio;}
	
	public String toString()
	{
		return(this.getNome() +'\n'+ this.getIndirizzo() +'\n'+  this.getUfficio()+'\n' );
	}
}
