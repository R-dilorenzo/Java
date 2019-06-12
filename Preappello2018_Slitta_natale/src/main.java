import java.io.File;
import java.io.FileNotFoundException;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * Crea un oggetto SlittaDiBabboNatale con un peso massimo di 1000Kg. Aggiungere
		 * alla slitta regali scelti in maniera casuale tra regali adulti (il cui peso
		 * massimo è 30kg) e regali bambini (il cui peso massimo è 20 kg).
		 */
		GregorianCalendar data = new GregorianCalendar();

		SlittaDiBabboNatale slitta = new SlittaDiBabboNatale(1000);

		Random rd = new Random();

		int totale = 0;
		

		String[] città = { "Nord", "Centro", "Sud" };

		for (int i = 0; i < 5; i++) {
			int idx = rd.nextInt(3);
			String random = (città[idx]);
			int pesoRegaloBambino = rd.nextInt(20);
			int pesoRegaloAdulto = rd.nextInt(30);
			int random2 = rd.nextInt(2); // random: 0 bambino , 1 adulto
			if (random2 == 0) {
				RegaloBambino bambino = new RegaloBambino(data, pesoRegaloBambino, random, "bambino" + i, 10);
				slitta.aggiungiRegalo(bambino);
				totale += bambino.calcolaCosto();
			} else {
				RegaloAdulto adulto = new RegaloAdulto(data, pesoRegaloAdulto, random, "adulto" + i);
				slitta.aggiungiRegalo(adulto);
				totale += adulto.calcolaCosto();

			}

		}

		System.out.println(slitta.spedisci());
		System.out.println("Il prezzo totale è: " + totale);

		File inFile = new File("src/listaBambini.txt");
		Scanner b = new Scanner(inFile);
		
		String now = null;
		System.out.println("Inserisci il bambino da cercare: ");
		Scanner in = new Scanner(System.in);
		String cercoBambino = in.next();
		try {
		while ((now = b.next()) != null)   {
			if (now.equals(cercoBambino)) {
				System.out.println("Il bambino " + cercoBambino + " è in lista!");
			
				break;

			}}}catch(NoSuchElementException e) {
				System.out.println("Bambino non in lista");
			}finally {
				b.close();
				in.close();
			}

	

		

	}
}