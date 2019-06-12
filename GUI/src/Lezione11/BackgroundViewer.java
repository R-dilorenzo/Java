package Lezione11;

import javax.swing.JFrame;

/*
 * Main interfaccia gui con colore di sfondo che cambia attraverso dei bottoni
 */

public class BackgroundViewer
{
public static void main(String[] args)
{
   JFrame frame = new BackgroundFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("Background Colors");
   frame.setVisible(true);
}
}
