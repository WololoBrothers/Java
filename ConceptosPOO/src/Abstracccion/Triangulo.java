package Abstracccion;

public class Triangulo extends FiguraGeometrica{

	public Triangulo(float base, float altura) {
		super(base, altura);		
	}

	@Override
	public double calculoPerimetro() {
		return (base * altura) / 2;
	}	
}