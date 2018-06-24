package anonymousInnerClass;

public class HolaMundoClase {
	
	private void mensaje() {
	
		class saludoIngles implements HolaMundo{
			public void saludar(String nombre) {
				System.out.println("Hello "+ nombre);
			}
		};
		
		class saludoEspa�ol implements HolaMundo{
			public void saludar(String nombre) {
				System.out.println("Hola "+ nombre);
			}
		};
		
		HolaMundo saludoIngles = new saludoIngles();
		HolaMundo saludoEspa�ol = new saludoEspa�ol();
		saludoIngles.saludar("Mr. Burns");
		saludoEspa�ol.saludar("Juan topo");

	}
	
	public static void main(String[] args) {
		HolaMundoClase hm = new HolaMundoClase();
		hm.mensaje();
	}
}