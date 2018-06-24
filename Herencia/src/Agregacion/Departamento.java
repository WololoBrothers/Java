package Agregacion;

class Departmento 
{
    private String nombre;    

    String getNombre() {
    	return this.nombre;
    }
    
    private Estudiante[] estudiantes;
    
    
    Departmento(String nombre, Estudiante estudiantes[])
    {
        this.nombre = nombre;    
        this.estudiantes = estudiantes;
    }
    
    private Estudiante estudiante;
    
    Departmento(String nombre, Estudiante p_estudiante)
    {
        this.nombre = nombre;    
        this.estudiante = p_estudiante;
    }
    
     
    public void listaDepartamento(){
    	System.out.println(getNombre());
    	System.out.println(estudiante.getNombre());
    	
    	/*for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre());
		}*/
    	
    	
    }
}