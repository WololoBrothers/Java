package Agregacion;
 
class Estudiante 
{
    private String nombre;
    private int id ;
    private String departamento;
     
    Estudiante(String nombre, int id, String departamento) 
    {
         
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;         
    }
    
    public String getNombre() {
    	return this.nombre;
    }
}