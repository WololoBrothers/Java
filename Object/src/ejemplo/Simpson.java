package ejemplo;

public class Simpson {

	int edad;
	String nombre;
	String profesion;
	
	public Simpson(int pEdad, String pNombre, String pProfesion) {
		this.edad = pEdad;
		this.nombre= pNombre;
		this.profesion = pProfesion;		
	}
	
	public static void main(String[] args) {
		Simpson bart = new Simpson(11, "Bart", "Estudiante");
		System.out.println(bart.getClass());
	}	
}
