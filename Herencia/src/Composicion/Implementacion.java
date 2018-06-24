package Composicion;

public class Implementacion {

	public static void main(String[] args) {
		Libro l1 = new Libro("El señor de los anillos", "Tolkien");
		Libro l2 = new Libro("Misery", "Sthephen King");
		Libro l[] = {l1, l2};
		
		Biblioteca b = new Biblioteca(l);
		b.listarEjemplares();		
	}	
}