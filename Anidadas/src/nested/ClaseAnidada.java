package nested;

public class ClaseAnidada {
	
	private String dato;
	
	class ClaseInterna{
		
		void mensaje() {
			System.out.println(dato);
		}
		
	}
	
	public static void main(String[] args) {
		ClaseAnidada anidada = new ClaseAnidada();
		ClaseAnidada.ClaseInterna interna = anidada.new ClaseInterna();
		interna.mensaje();
	}

}
