package Ejemplo;

public interface Figura {
	   int RED = 1;
	   int GREEN = 2;
	   int BLUE = 3;
	   int BLACK = 4;
	   int WHITE = 5;
	   //void dibujar(int color);
	   default void dibujar (int color) {
		   System.out.println("Dibujando en color " + color);
	   }
}