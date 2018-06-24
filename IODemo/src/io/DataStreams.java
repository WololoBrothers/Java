package io;

import java.io.*;
 
public class DataStreams {
    
    static final String dataFile = "C:\\Users/Tom/Desktop/salida.txt";
    
    static final String[] texto = {"aaaabc","1234"};
    static final String texto2 = "aaaabc";
 
    public static void main(String[] args) throws IOException {
  
        DataOutputStream out = null;
         
        try {
            
            out = new DataOutputStream(new FileOutputStream(dataFile));            
            //for (int i = 0; i < texto.length; i ++) {
            	//System.out.println(texto[i]);
                //out.writeUTF(texto[i]);                
            //}
            
            out.writeUTF(texto2);
                     
        } finally {
            out.close();
        }
 
        DataInputStream in = null;
        
        try {
            in = new DataInputStream(new FileInputStream(dataFile));
 
            String desc = null;
            int dato;
            
            try {
                while(true){
                    desc = in.readUTF();                	
                    System.out.format("desc" + " " + desc);
                }
            } catch (EOFException e) { }
        }
        finally {
            in.close();
        }
    }
}