package anonymousInnerClass;

public class HolaMundoClase2 {
	
	public void mensaje() {
	
		HolaMundo saludoIngles = new HolaMundo(){
			public void saludar(String nombre) {
				System.out.println("Hello "+ nombre);
			}
		};
		
		HolaMundo saludoEspa�ol = new HolaMundo(){
			public void saludar(String nombre) {
				System.out.println("Hola "+ nombre);
			}
		};
				
		saludoIngles.saludar("Mr. Burns");
		saludoEspa�ol.saludar("Juan topo");
	}
	
	public static void main(String[] args) {
		HolaMundoClase2 hm = new HolaMundoClase2();
		hm.mensaje();
	}
	
}