package io;

import java.io.*; 
public class LeerConsolaEscribir { 

	public static void main(String args[]) throws IOException { 
		InputStreamReader cin = null; 
		FileWriter fw = new FileWriter("C:\\Users/Tom/Desktop/salida.txt");
		
		try { 
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit."); 
			char c;
			int escribir;
			
			while( (escribir = cin.read()) != 'q') {
				if (  escribir != -1 && escribir != 13 && escribir != 10 ) {
					System.out.print("Escribir: "+ escribir + "\n");
					c = (char) escribir; 
					System.out.print("C: "+ c + "\n");
					fw.write(escribir);					
				}
			}

		}finally { 
			if (cin != null) { 
				cin.close(); 
			}
			if (fw!= null) { 
				fw.close(); 
			}
		} 
	} 
}