package Lezione11;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TimeInterestFrame extends JFrame{
	
	public TimeInterestFrame(){
		
		  JPanel northPanel = new JPanel();
	      northPanel.setLayout(new GridLayout(4, 2));
	      
	      final JTextField initialBalanceField = new JTextField("0");
	      final JTextField annualRateField = new JTextField("10");
	      final JTextField yearsField = new JTextField("30");
	      final JTextField balanceField = new JTextField("0");
	      
	      northPanel.add(new JLabel("    Initial Balance    "));
	      northPanel.add(initialBalanceField);
	      northPanel.add(new JLabel("    Annual Rate    "));
	      northPanel.add(annualRateField);
	      northPanel.add(new JLabel("    Number of Years    "));
	      northPanel.add(yearsField);
	      
	      JButton calculateButton = new JButton("Calculate");
	      
	      class ButtonListener implements ActionListener
	      {  
	         public void actionPerformed(ActionEvent event)
	         {  
	            double balance = Double.parseDouble(initialBalanceField.getText());
	            double rate = Double.parseDouble(annualRateField.getText());
	            int nyears = Integer.parseInt(yearsField.getText());
	   
	            for (int year = 1; year <= nyears; year++)
	            {  
	               double interest = balance * rate / 100;
	               balance = balance + interest;
	            }
	   
	            balanceField.setText("" + balance);
	         }
	      }      

	      ActionListener listener = new ButtonListener();
	      calculateButton.addActionListener(listener);
	      
	      northPanel.add(calculateButton);
	      northPanel.add(balanceField);

	      
	      add(northPanel, BorderLayout.NORTH);      
	      pack();
	      
	   }
	
}
