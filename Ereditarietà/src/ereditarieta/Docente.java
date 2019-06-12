package ereditarieta;

/***********************************
 *                                 * 
 *  Autore File : Giuseppe Siani   *  
 *                                 *  
 ***********************************/
 
public class Docente extends Dipendente
{
private  String disciplina;

public Docente(String nome, char sesso, String indirizzo,String disciplina)
{
super(nome,sesso,indirizzo);	
this.disciplina=disciplina;
}

public void setDisciplina(String disciplina)
{
	this.disciplina=disciplina;
}
public String getDisciplina()
{return disciplina;}

public String toString()
{
	return(this.getNome() +'\n'+ this.getIndirizzo() +'\n'+  this.getDisciplina()+'\n' );
}
}
