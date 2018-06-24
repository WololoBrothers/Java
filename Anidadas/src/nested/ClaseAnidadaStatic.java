package nested;

public class ClaseAnidadaStatic {

	static class ClaseEstatica{
		
		void mensaje() {
			System.out.println("mensaje dde clase estatica");
		}
		
	}
	
	public static void main(String[] args) {
		
		ClaseAnidadaStatic.ClaseEstatica stat = new ClaseEstatica();
		stat.mensaje();
		
	}
	
	
}
