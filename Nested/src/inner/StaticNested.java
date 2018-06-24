package inner;

public class StaticNested {
	
	static private String dato;
	
	static class ClaseEstatica{
		
		void mensaje() {
			System.out.println("Salida desde clase estatica");
			System.out.println(dato);
		}
		
	}
	
	public static void main(String[] args) {
		
		StaticNested.ClaseEstatica ce = new ClaseEstatica();
		ce.mensaje();
		
	}

}
