package Lezione11;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class BackgroundRadioFrame extends JFrame {
	
	public BackgroundRadioFrame()
	   { 
	      colorPanel = new JPanel();
	      colorPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	      
	      add(colorPanel, BorderLayout.CENTER);
	      
	      createControlPanel();
	      
	      pack();
	   }
	   
	public void createControlPanel()
	   {
	      JRadioButton redButton = makeButton("Red", Color.red);
	      JRadioButton greenButton = makeButton("Green", Color.green);
	      JRadioButton blueButton = makeButton("Blue", Color.blue);

	      ButtonGroup group = new ButtonGroup();
	      group.add(redButton);
	      group.add(greenButton);
	      group.add(blueButton);
	      JPanel southPanel = new JPanel();
	      southPanel.add(redButton);
	      southPanel.add(greenButton);
	      southPanel.add(blueButton);
	      
	      add(southPanel, BorderLayout.SOUTH);

	      redButton.setSelected(true);
	      colorPanel.setBackground(Color.red);
	   }

	public JRadioButton makeButton(String label, final Color color)
	   {
	      JRadioButton button = new JRadioButton(label);
	      
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
