package anonymousInnerClass;

public class ClaseExterna2 extends ClaseAnonima {

	@Override
	public void metodo() {
		System.out.println("Salida desde metodo sobreescrito");		
	}
	
	public static void main(String[] args) {
		ClaseExterna2 interna2 = new ClaseExterna2();
		interna2.metodo();	
	}	
}