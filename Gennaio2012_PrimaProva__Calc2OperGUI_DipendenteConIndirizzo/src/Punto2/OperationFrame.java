package Punto2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class OperationFrame extends JFrame {

	public OperationFrame(){
		createOperando1();
		createOperando2();
		createRadio();
		createButton();
		labelFinal=new JLabel();
		createPanel();
		}
	
	public void createOperando1(){
		label1=new JLabel("Operando1:");
		field1=new JTextField(10);}
	
	public void createOperando2(){
		label2=new JLabel("Operando2:");
		field2=new JTextField(10);}
	
	public void createRadio(){
		ButtonGroup group=new ButtonGroup();
		radio1=new JRadioButton("add");
		radio2=new JRadioButton("mul");
		group.add(radio1);
		group.add(radio2);}
	
	public void createButton(){
		button=new JButton("=");
		
		class OperationListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				double op1=Double.parseDouble(field1.getText());
				double op2=Double.parseDouble(field2.getText());
				double result;
				if(radio1.isSelected()) labelFinal.setText(""+(op1+op2));
				else if(radio2.isSelected()) labelFinal.setText(""+(op1*op2));}}
		ActionListener listener=new OperationListener();
		button.addActionListener(listener);}
	
	public void createPanel(){
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,3));
		panel.add(label1);
		panel.add(field1);
		panel.add(radio1);
		panel.add(label2);
		panel.add(field2);
		panel.add(radio2);
		panel.add(button);
		panel.add(labelFinal);
		add(panel);
		
		
	}
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JButton button;
	private JLabel labelFinal;
}
