package Composicion;

public class Biblioteca {
	
    private Libro[] libros;
    
    Biblioteca (Libro[] listaLibros)
    {
        this.libros = listaLibros; 
    }
     
    public void listarEjemplares(){
         
       for (int i = 0; i < libros.length; i++) {
    	   System.out.println(libros[i].getTituto());
       }    	
    }
}