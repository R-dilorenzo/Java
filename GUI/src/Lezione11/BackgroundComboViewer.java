package Lezione11;

import javax.swing.JFrame;

/*
 * Main interfaccia gui che cambia il colore di sfondo attraverso dei combo box
 */

public class BackgroundComboViewer
{
public static void main(String[] args)
{
   JFrame frame = new BackgroundComboFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("BackgroundColors");
   frame.setVisible(true);
}
}
