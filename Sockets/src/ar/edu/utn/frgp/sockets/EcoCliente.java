package ar.edu.utn.frgp.sockets;

import java.io.*;
import java.net.*;

public class EcoCliente {
    public static void main(String[] args) throws IOException {
        
    	String host = "127.0.0.1";
    	int puerto = 17;

        String hostName = host;
        int portNumber = puerto;

        try (
            Socket echoSocket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader( new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in))
        ) {
            String entrada;
            while ((entrada = stdIn.readLine()) != null) {
                out.println(entrada);
                System.out.println("Mensaje desde Server: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Host " + hostName + " desconocido");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("No se pudo establecer conexion con host " + hostName);
            System.exit(1);
        } 
    }
}