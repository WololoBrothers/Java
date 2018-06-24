package excepcion;
import java.io.*;

public class ExceptionDemo {
	public static void main(String[] args) throws IOException  {				
		FileInputStream f = null;	
		try {
			f = new FileInputStream("test.txt");
		} catch (IOException e) {
			e.printStackTrace();				
		} finally {
			if (f != null)
				f.close();
		}
	}	 	
}