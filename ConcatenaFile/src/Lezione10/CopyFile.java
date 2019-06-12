package Lezione10;


import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program copies one file to another.
*/
public class CopyFile
{  
   public static void main(String[] args) throws FileNotFoundException
   {  
      if (args.length != 2)
      {  
         System.out.println("Usage: CopyFile sourcefile targetfile");
         return;
      }
      String source = args[0];
      String target = args[1];
      File reader = new File(source);
      PrintWriter out = new PrintWriter(target);
      Scanner in = new Scanner(reader);
      while (in.hasNextLine())
         out.println(in.nextLine());
      in.close();
      out.close();
   }
}
