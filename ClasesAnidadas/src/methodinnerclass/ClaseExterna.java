package methodinnerclass;

public class ClaseExterna {
	
	private void miMetodo() {		
	
		class ClaseAnidadaDeMetodo {
			void mostrar() {
				System.out.println("En una clase anidada de metodo");
			}
		}
		
		ClaseAnidadaDeMetodo cm = new ClaseAnidadaDeMetodo();
		cm.mostrar();		
		System.out.println("asd");
	}
	
	public static void main(String[] args) {		
		ClaseExterna externa = new ClaseExterna();
		externa.miMetodo();	
	}
}