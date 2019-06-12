package Lezione11;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BackgroundControlFrame extends JFrame{

	public BackgroundControlFrame()
	   {
	      colorPanel = new JPanel();
	      colorPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

	      add(colorPanel, BorderLayout.CENTER);

	      createControlPanel();

	      pack();
	   }
	
	
	public void createControlPanel()
	   {
	      redButton = new JCheckBox("Red");
	      greenButton = new JCheckBox("Green");
	      blueButton = new JCheckBox("Blue");

	      class ColorListener implements ActionListener
	      {
	         public void actionPerformed(ActionEvent event)
	         {
	            setColor();
	         }
	      }

	      redButton.addActionListener(new ColorListener());
	      greenButton.addActionListener(new ColorListener());
	      blueButton.addActionListener(new ColorListener());
	      JPanel southPanel = new JPanel();
	      southPanel.add(redButton);
	      southPanel.add(greenButton);
	      southPanel.add(blueButton);

	      add(southPanel, BorderLayout.SOUTH);

	      setColor();
	   }

	public void setColor()
	   {
	      float red = 0;
	      float green = 0;
	      float blue = 0;
	      if (redButton.isSelected()) red = 1;
	      if (greenButton.isSelected()) green = 1;
	      if (blueButton.isSelected()) blue = 1;
	      Color c = new Color(red, green, blue);
	      colorPanel.setBackground(c);
	   }

	   private JPanel colorPanel;
	   private JCheckBox redButton;
	   private JCheckBox greenButton;
	   private JCheckBox blueButton;
	   private static final int PANEL_WIDTH = 300;
	   private static final int PANEL_HEIGHT = 300;

	
	
}
