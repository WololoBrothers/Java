package Abstracccion;

public class Calculos {
	
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10, 5);
		Triangulo t1 = new Triangulo(10, 5);
		System.out.println("Perimetro de rectangulo: "+ r1.calculoPerimetro());
		System.out.println("Perimetro de triangulo: "+ t1.calculoPerimetro());
	}
}