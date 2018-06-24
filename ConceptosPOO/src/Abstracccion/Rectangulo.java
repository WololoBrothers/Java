package Abstracccion;

public class Rectangulo extends FiguraGeometrica{

	public Rectangulo(float base, float altura) {
		super(base, altura);
	}
	
	@Override
	public double calculoPerimetro() {
		return base * altura;
	}
	
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10, 5);
		System.out.println(r1.calculoPerimetro());
	}	
}