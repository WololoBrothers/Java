package anonymousInnerClass;

public class HolaMundoClase2 {
	
	public void mensaje() {
	
		HolaMundo saludoIngles = new HolaMundo(){
			public void saludar(String nombre) {
				System.out.println("Hello "+ nombre);
			}
		};
		
		HolaMundo saludoEspañol = new HolaMundo(){
			public void saludar(String nombre) {
				System.out.println("Hola "+ nombre);
			}
		};
				
		saludoIngles.saludar("Mr. Burns");
		saludoEspañol.saludar("Juan topo");
	}
	
	public static void main(String[] args) {
		HolaMundoClase2 hm = new HolaMundoClase2();
		hm.mensaje();
	}
	
}