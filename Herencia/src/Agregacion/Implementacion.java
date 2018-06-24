package Agregacion;

public class Implementacion {
	
    public static void main (String[] args){
    
	    Estudiante s1 = new Estudiante("Bart", 1, "TSSI");
	    Estudiante s2 = new Estudiante("Lisa", 2, "TSSI");
	    Estudiante a1[] = {s1, s2};
	    
	    //Departmento TSSI = new Departmento("TSSI", a1);        
	    Departmento TSSI = new Departmento("TSSI", s1);
	     	
	    System.out.print("Estudiantes en Departamento:");
	    TSSI.listaDepartamento();	    
    }   
}