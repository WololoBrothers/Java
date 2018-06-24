package anonymousInnerClass;

public class HolaMundoClase {
	
	private void mensaje() {
	
		class saludoIngles implements HolaMundo{
			public void saludar(String nombre) {
				System.out.println("Hello "+ nombre);
			}
		};
		
		class saludoEspañol implements HolaMundo{
			public void saludar(String nombre) {
				System.out.println("Hola "+ nombre);
			}
		};
		
		HolaMundo saludoIngles = new saludoIngles();
		HolaMundo saludoEspañol = new saludoEspañol();
		saludoIngles.saludar("Mr. Burns");
		saludoEspañol.saludar("Juan topo");

	}
	
	public static void main(String[] args) {
		HolaMundoClase hm = new HolaMundoClase();
		hm.mensaje();
	}
}