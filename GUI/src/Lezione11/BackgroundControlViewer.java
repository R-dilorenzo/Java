package Lezione11;

import javax.swing.JFrame;

/*
 * Main interfaccia gui che cambia il colore di sfondo attraverso dei checkbox
 */

public class BackgroundControlViewer
{
public static void main(String[] args)
{
   JFrame frame = new BackgroundControlFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("BackgroundColors");
   frame.setVisible(true);
}
}

