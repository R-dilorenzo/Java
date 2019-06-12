package Punto3;

import javax.swing.JFrame;

import Punto3.OperationFrame;

public class FrameTester {

	public static void main(String[] args) {
		OperationFrame op=new OperationFrame();
		op.setSize(300,400);
		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		op.setVisible(true);
	}

	

}
