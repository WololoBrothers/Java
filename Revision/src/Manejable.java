
public interface Manejable {

	void acelerar(int unidades);
	void frenar(int unidades);
	
	default void demo() {
		acelerar(10);
		frenar(5);
	}
	
	static void mostrarLimiteVelocidad() {
		System.out.println("Limite 60");
	}
	
}