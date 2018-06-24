package ar.edu.utn.frgp.sockets;

import java.net.*;
import java.io.*;

public class EcoServerMultiThread extends Thread{

	Socket clientSocket = null;

	public EcoServerMultiThread(Socket clientSocket) {
		super();
		this.clientSocket = clientSocket;
	}

	public void run(){
		try (                             
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);                   
				BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));        	
				){
			String entrada;
			while ((entrada = in.readLine()) != null) {
				System.out.println(entrada);
				out.println("Eco de Cliente: " + entrada);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}