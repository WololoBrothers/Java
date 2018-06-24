package nested;

public class ClaseMetodo {

	void mensaje() {
		
		class ClaseMetodoInterna{
			
			void salida() {
				System.out.println("mensaje desde clase de metodo");
			}
			
		}
		
		ClaseMetodoInterna cla = new ClaseMetodoInterna();
		cla.salida();
		
	}
	
	public static void main(String[] args) {
		
		ClaseMetodo cla = new ClaseMetodo();
		cla.mensaje();
		
	}
	
}
