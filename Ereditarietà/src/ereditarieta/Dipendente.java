package ereditarieta;

/***********************************
 *                                 * 
 *  Autore File : Giuseppe Siani   *  
 *                                 *  
 ***********************************/
 
public class Dipendente
{
private String nome;
private char sesso;
private String indirizzo;

public Dipendente(String nome, char sesso,String indirizzo)
{
	this.nome= nome;
	this.sesso=sesso;
	this.indirizzo= indirizzo;
}

public String getNome()
{
return nome;	
}

public char getSesso()
{
return sesso;	
}

public String getIndirizzo()
{
return indirizzo;	
}

public void setIndirizzo(String indirizzo)
{
this.indirizzo=indirizzo;	
}
}
