package Lezione11;

import javax.swing.JFrame;

/*
 * Main interfaccia GUI per calbiare colore sfondo a un pannello con i radio button
 */

public class BackgroundRadioViewer
{
public static void main(String[] args)
{
   JFrame frame = new BackgroundRadioFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("BackgroundColors");
   frame.setVisible(true);
}
}

