package ar.utn.frgp.regex;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegexTest {

    public static void main(String[] args){

    	Scanner scanner = new Scanner(System.in);
    	boolean found;
    	String valor;
    	
    	while (true) {
 		
        	System.out.println("Ingresar REGEX: ");    		
    		Pattern pattern = Pattern.compile(valor = scanner.nextLine());   		
    		
    		if (valor.equals("q")){
    			Runtime.getRuntime().exit(1);
    			scanner.close();
    		}	
    		
    		System.out.println("Ingresar cadena donde buscar: ");
    		Matcher matcher = pattern.matcher(scanner.nextLine());
    		
            found = false;
            while (matcher.find()) {
            	System.out.format("Texto encontrado" +
                " \"%s\" comenzando en " +
                "index %d y finalizando en indice %d.%n",
                matcher.group(),
                matcher.start(),
                matcher.end());
            	found = true;
            }
            if(!found){
            	System.out.format("No se encontro patron.%n");
            }
        }
    }
}