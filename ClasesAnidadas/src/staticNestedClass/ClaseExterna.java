package staticNestedClass;

public class ClaseExterna {
	
	static class InternaDemo{
		private void metodo() {
			System.out.println("Salida desde metodo de clase estatica anidada");
		}
	}
	
	public static void main(String[] args) {
		ClaseExterna.InternaDemo interna = new ClaseExterna.InternaDemo();
		interna.metodo();
	}
}