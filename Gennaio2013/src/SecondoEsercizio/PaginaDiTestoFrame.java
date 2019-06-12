package SecondoEsercizio;

import javax.swing.*;

public class PaginaDiTestoFrame extends JFrame {

	public PaginaDiTestoFrame(String s){
		super("PAGINA DI TESTO");
		JPanel panel=new JPanel();
		area=new JLabel(s);
		panel.add(area);
		this.add(panel);
		this.setSize(200,300);
		this.setVisible(true);
		
	}
	private JLabel area;
}
