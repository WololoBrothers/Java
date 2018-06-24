package anonymousInnerClass;

public class ClaseExterna {

	public static void main(String[] args) {

		ClaseAnonima interna = new ClaseAnonima() {
			public void metodo() {
				System.out.println("Salida desde clase anonima interna");
			}
		};
		
		interna.metodo();
		
	}	
}