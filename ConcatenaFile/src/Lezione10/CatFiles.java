package Lezione10;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program concatenates contents of several files into one file.
*/
public class CatFiles
{  
   public static void main(String[] args) throws FileNotFoundException
   {  
      if (args.length < 2)
      {  
         System.out.println("Usage: CatFiles sourcefile1 sourcefile2 . . . targetfile");
         return;
      }

      String target = args[args.length - 1];
      PrintWriter out = new PrintWriter(target);
      for (int i = 0; i < args.length - 1; i++)
      { 
         String source = args[i];
         File reader = new File(source);
         Scanner in = new Scanner(reader);
         while (in.hasNextLine())
            out.println(in.nextLine());
         in.close();
      }
      out.close();
   }
}
