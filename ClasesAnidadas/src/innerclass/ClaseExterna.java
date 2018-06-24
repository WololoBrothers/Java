package innerclass;

public class ClaseExterna {
	
	private int numeroMagico = 7;
	
	class ClaseInterna{
		
		private void show() {
			System.out.println("En un metodo de una clase anidada");
			System.out.println(numeroMagico);
		}
		
	}
	
	public static void main(String[] args) {
		
		ClaseExterna externa = new ClaseExterna();
		ClaseExterna.ClaseInterna anidada = externa.new ClaseInterna();
		anidada.show();		
	}
}