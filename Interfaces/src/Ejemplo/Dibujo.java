package Ejemplo;

public class Dibujo{
	
	public static void main(String[] args) {
		Coloreable[] coloreables = new Coloreable[] {new Circulo(10, 20, 15), new Circulo(10, 30, 25) };
		
		for (int i = 0; i < coloreables.length; i++) {
			coloreables[i].dibujar(Figura.RED);
			coloreables[i].colorear(Coloreable.RED);
		}
						
	}
	
}