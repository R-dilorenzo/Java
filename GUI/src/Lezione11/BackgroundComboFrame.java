package Lezione11;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackgroundComboFrame extends JFrame {

	public BackgroundComboFrame()
	   {
	      colorPanel = new JPanel();
	      colorPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

	      add(colorPanel, BorderLayout.CENTER);

	      createControlPanel();

	      pack();
	   }

	public void createControlPanel()
	   {
	      colorCombo = new JComboBox();
	      colorCombo.addItem("Red");
	      colorCombo.addItem("Green");
	      colorCombo.addItem("Blue");

	      class ColorListener implements ActionListener
	      {
	         public void actionPerformed(ActionEvent event)
	         {
	            Color c = Color.red;
	            String color = (String)colorCombo.getSelectedItem();
	            if (color.equals("Red")) c = Color.red;
	            else if (color.equals("Green")) c = Color.green;
	            else if (color.equals("Blue"))  c = Color.blue;
	            colorPanel.setBackground(c);
	         }
	      }
	      colorCombo.addActionListener(new ColorListener());

	      

	      JPanel southPanel = new JPanel();
	      southPanel.add(colorCombo);

	      add(southPanel, BorderLayout.SOUTH);
	   }

	   private JPanel colorPanel;
	   private JComboBox colorCombo;
	   private static final int PANEL_WIDTH = 300;
	   private static final int PANEL_HEIGHT = 300;
	}

	
	

