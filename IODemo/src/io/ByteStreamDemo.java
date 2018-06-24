package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			//in = new FileInputStream("entrada.txt");
			in = new FileInputStream("C:\\Users/Tom/Desktop/entrada.txt");
			out = new FileOutputStream("C:\\Users/Tom/Desktop/salida.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.println(c);
				out.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
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