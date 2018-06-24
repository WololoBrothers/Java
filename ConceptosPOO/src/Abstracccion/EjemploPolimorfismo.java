package Abstracccion;

public class EjemploPolimorfismo {
	
	public static void main(String[] args) {

		FiguraGeometrica fg;
		
		Rectangulo r1 = new Rectangulo(10, 5);
		Triangulo t1 = new Triangulo(10, 5);		
		
		fg = r1;
		System.out.println("Perimetro de rectangulo: ");
		System.out.println(fg.calculoPerimetro());

		fg = t1;
		System.out.println("Perimetro de triangulo: ");
		System.out.println(fg.calculoPerimetro());		
	}
}