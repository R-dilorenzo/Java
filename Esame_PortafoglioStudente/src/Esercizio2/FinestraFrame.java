package Esercizio2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import Esercizio1.CorsoDiFormazione;

public class FinestraFrame extends JFrame  {

	public FinestraFrame(CorsoDiFormazione corso1,CorsoDiFormazione corso2,CorsoDiFormazione corso3){
		super("SIMULAZIONE");
		JPanel contenitore=new JPanel();
		contenitore.add(createCorsiButton());
		contenitore.add(createSimulazioneButton());
		contenitore.add(createArea());
		add(contenitore);
	}
	
	public  JPanel createCorsiButton(){
		JPanel panel=new JPanel();
		ButtonGroup gruppo=new ButtonGroup();
		corso1=new JRadioButton("Corso1");
		corso2=new JRadioButton("Corso2");
		corso3=new JRadioButton("Corso3");
		gruppo.add(corso1);
		gruppo.add(corso2);
        gruppo.add(corso3);
        panel.add(corso1);
        panel.add(corso2);
        panel.add(corso3);
        return panel;}
	
	public JPanel createSimulazioneButton(){
		JPanel panel=new JPanel();
		JButton avvia=new JButton("Avvia Simulazione");
		class ButtonListener implements ActionListener{

			public void actionPerformed(ActionEvent pressione) {
				if(corso1.isSelected()){}
					// mostra info relative alprimo corso
				else if(corso2.isSelected()){}
					// mostra info relative al2corso
				else if(corso3.isSelected()){}
					// mostra info relative alprimo corso

				
			}
			
		}
		ActionListener l=new ButtonListener();
		avvia.addActionListener(l);
		panel.add(avvia);
		return panel;
		
	}
	
	public JPanel createArea(){
		JPanel panel=new JPanel();
		area=new JTextArea();
		area.setEditable(false);
		panel.add(area);
		return panel;
	}
	
	private JRadioButton corso1;
	private JRadioButton corso2;
	private JRadioButton corso3;
	private JTextArea area;
}
