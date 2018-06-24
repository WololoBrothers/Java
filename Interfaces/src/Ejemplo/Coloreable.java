package Ejemplo;

public interface Coloreable extends Figura{
	
	void colorear(int color);
	void dibujar(int color);
	static void mensaje() {
		System.out.println("mensaje");
	}
}

