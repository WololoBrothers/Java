package Revision;

public class Bicicleta implements Manejable{
	
	float velocidad;

	@Override
	public void arrancar() {
		System.out.println("Encendiendo el auto");
	}
	
	@Override
	public void acelerar(float cantidad) {
		velocidad += cantidad;
		System.out.println("Acelerando hasta alcanzar velocidad " + velocidad );
	}

	@Override
	public void frenar(float cantidad) {
		velocidad -= cantidad;
		System.out.println("Frenando hasta alcanzar velocidad " + velocidad );		
	}
	
	@Override //Default
	public void demo() {
		arrancar();
		acelerar(10);
		frenar(10);
	}
	
	public static void main(String[] args) {
		Bicicleta bike1 = new Bicicleta();
		bike1.demo();
		Manejable.informarLimiteVel();
	}
}