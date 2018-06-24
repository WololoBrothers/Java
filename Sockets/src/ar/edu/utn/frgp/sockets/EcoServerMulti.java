package ar.edu.utn.frgp.sockets;

import java.net.*;
import java.io.*;

public class EcoServerMulti {
    public static void main(String[] args) throws IOException {
        
    	int puerto = 17;
        boolean listening = true;
        
        try (ServerSocket serverSocket = new ServerSocket(puerto)) { 
            while (listening) {
	            new EcoServerMultiThread(serverSocket.accept()).start();
	            System.out.println("entra");
	        }
	    } catch (IOException e) {
            System.err.println("Could not listen on port " + puerto);
            System.exit(-1);
        }
    }
}