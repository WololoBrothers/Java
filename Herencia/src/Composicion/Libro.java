package Composicion;

public class Libro {
	
	 private String titulo;
	 private String autor;
	     
     Libro(String titulo, String autor)
     {         
        this.titulo = titulo;
        this.autor = autor;
     }
     
     public String getTituto() {
    	 return this.titulo;
     }
}