package modificadoresAcceso;

public class DemoPrivado {
	
	private int datoPrivado;

	private void metodoPrivado() {
		System.out.println("metodo privado");
	}

}

class ExternaDemo{
	
	public static void main(String[] args) {
		System.out.println("lalala");
	}
}
