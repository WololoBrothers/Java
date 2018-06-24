package serial;

import java.io.*;
public class SerializeDemo {

	public static void main(String [] args) throws IOException {
		
		Empleado e = new Empleado("Wandulfo Smithers", "Plantea Nuclear de Springfield", 101);		
		String path = "C:\\Users/Tom/Desktop/datosSerial.txt";
		
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;		
		
		try {
			fileOut = new FileOutputStream(path);
			out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Datos serializados almacenados");

		} catch (IOException i) {    	  
			i.printStackTrace();

		} finally {
			if (fileOut != null)
				fileOut.close();
			if (out != null)
				out.close();

		}
	}
}