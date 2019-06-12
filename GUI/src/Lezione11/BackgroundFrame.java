package Lezione11;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BackgroundFrame extends JFrame {

	public BackgroundFrame()
	   {
	      colorPanel = new JPanel();
	      colorPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	      
	      add(colorPanel, BorderLayout.CENTER);

	      createControlPanel();

	      pack();
	   }
	/**
    Crea il pannello di controllo con i bottoni in basso
 */
 public void createControlPanel()
 {
    
    JPanel southPanel = new JPanel();
    southPanel.add(makeButton("Red", Color.red));
    southPanel.add(makeButton("Green", Color.green));
    southPanel.add(makeButton("Blue", Color.blue));

    add(southPanel, BorderLayout.SOUTH);
 }

 /**
 Crea un bottone per cambiare il colore del pannello
 @param label l’etichetta del bottone
 @param color il colore da settare
 @return button il bottone per cambiare il colore del pannello
*/
public JButton makeButton(String label, final Color color)
{
 JButton button = new JButton(label);

 class ButtonListener implements ActionListener
 {
    public void actionPerformed(ActionEvent event)
    {
       colorPanel.setBackground(color);
    }
 }
 ButtonListener listener = new ButtonListener();
 button.addActionListener(listener);
 return button;
}



private JPanel colorPanel;
private static final int PANEL_WIDTH = 300;
private static final int PANEL_HEIGHT = 300;
	
}
