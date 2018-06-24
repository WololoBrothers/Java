package Abstracccion;

public abstract class FiguraGeometrica {
	
	float base;
	float altura;
	
	public abstract double calculoPerimetro();
	
	public FiguraGeometrica(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
}