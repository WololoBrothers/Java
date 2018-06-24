package serial;

import java.io.*;
public class DeserializeDemo {

   public static void main(String [] args) {
      Empleado e = null;
      String path = "C:\\Users/Tom/Desktop/datosSerial.txt";
      
      try {
         FileInputStream fileIn = new FileInputStream(path);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Empleado) in.readObject();
         in.close();
         fileIn.close();
         
      } catch (IOException i) {
         i.printStackTrace();
         return;
         
      } catch (ClassNotFoundException c) {
         System.out.println("Clase de empleado no encontrada");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Des-serializando Empleado...");
      System.out.println(e.toString());
   }
}