package io;
import java.io.*;

public class DataInput_Stream {

	public static void main(String args[])throws IOException {

		DataOutputStream dataOut = null;

		try {
			dataOut = new DataOutputStream(new FileOutputStream("C:\\Users/Tom/Desktop/salida2.txt"));
			dataOut.writeInt(123);
			//dataOut.writeUTF("hello");

			// writing string to a file encoded as modified UTF-8
			//DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\\\Users/Tom/Desktop/salida.txt"));
			//dataOut.writeUTF("hello");

			// Reading data from the same file
			DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\Users/Tom/Desktop/salida2.txt"));

			while(dataIn.available()>0) {
				//String k = dataIn.readUTF();
				int a = dataIn.readInt(); 
				System.out.print(a);
			}

		} finally {
			dataOut.close();
		}
	}
}