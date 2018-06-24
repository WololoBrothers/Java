package Revision;

public interface Manejable {
	
	float limiteVelCalles = 20;
	
	void arrancar();
	void acelerar(float cantidad);
	void frenar(float cantidad);
	
	default void demo() {
		arrancar();
		acelerar(10);
		frenar(5);
	}
	
	static void informarLimiteVel() {
		System.out.println("El limite de velocidad es de " + limiteVelCalles);	
	}
}