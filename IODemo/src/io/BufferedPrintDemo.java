package io;

import java.io.*; 

public class BufferedPrintDemo {

	public static void main(String[] args) throws IOException { 

		BufferedReader inputStream = null; 
		PrintWriter outputStream = null; 

		try { 
			inputStream = new BufferedReader(new FileReader("C:\\Users/Tom/Desktop/entrada.txt")); 
			outputStream = new PrintWriter(new FileWriter("C:\\Users/Tom/Desktop/salida.txt")); 

			String l; 
			while ((l = inputStream.readLine()) != null) { 
				System.out.println(l);
				outputStream.println(l); 
			} 
		} finally { 
			if (inputStream != null) { 
				inputStream.close(); 
			} 
			if (outputStream != null) { 
				outputStream.close(); 
			} 
		} 
	} 
}