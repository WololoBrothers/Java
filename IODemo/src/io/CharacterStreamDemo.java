package io;

import java.io.*; 

public class CharacterStreamDemo { 
  
   public static void main(String args[]) throws IOException {  
      FileReader in = null; 
      FileWriter out = null; 
  
      try { 
        
         in = new FileReader("C:\\Users/Tom/Desktop/entrada.txt"); 
         out = new FileWriter("C:\\Users/Tom/Desktop/salida.txt"); 
         
         int c; 
         while ((c = in.read()) != -1) { 
            out.write(c); 
         } 
      }finally { 
         if (in != null) { 
            in.close(); 
         } 
         if (out != null) { 
            out.close(); 
         } 
      } 
   } 
}