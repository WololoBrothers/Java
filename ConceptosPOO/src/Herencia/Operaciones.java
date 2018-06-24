package Herencia;

public class Operaciones {
	
	void suma(int x, int i) {
		int resultado = x + i;
		System.out.println("La suma de las variables es: " + resultado);
	}
	
	void resta(int x, int i) {
		int resultado = x - i;
		System.out.println("La resta de las variables es: " + resultado );
	}
}

class MisOperaciones extends Operaciones{
	
	void multiplicacion(int i, int x) {
		int resultado = x * i;
		System.out.println("La multiplicación de las variables es: " + resultado);
	}
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		MisOperaciones oper = new MisOperaciones();
		oper.suma(a, b);
		oper.resta(a, b);
		oper.multiplicacion(a, b);
		
	}
	
}