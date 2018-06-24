package inner;

public class Contacto {
	
	private String nombre;
	
	class ClaseInterna{

		private String varInt;
		
		//visibilidad desde clase interna a externa
		void mensaje() {
			System.out.println(nombre);
		}
		
	}
	
	public static void main(String[] args) {
		//Forma de instanciacion
		Contacto contact = new Contacto();
		//Asociada a instancia de clase externa
		Contacto.ClaseInterna claseint = contact.new ClaseInterna();
		claseint.mensaje();
	}

}
