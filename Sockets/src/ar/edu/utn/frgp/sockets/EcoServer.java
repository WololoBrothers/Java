package ar.edu.utn.frgp.sockets;

import java.net.*;
import java.io.*;

public class EcoServer {
    public static void main(String[] args) throws IOException {
        
        int puerto = 16;
        
        try (
            ServerSocket serverSocket = new ServerSocket(puerto);
            Socket clientSocket = serverSocket.accept();     
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);                   
            BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));          
        ) {
            String entrada;
            System.out.println("Escuchando en puerto " + puerto);
            while ((entrada = in.readLine()) != null) {
                out.println("Eco de Cliente: " + entrada);      
                System.out.println(entrada);
            }
        } catch (IOException e) {
            System.out.println("Excepcion al escuchar en puerto " + puerto + " o escuchando conexion");
            System.out.println(e.getMessage());
        }
    }
}