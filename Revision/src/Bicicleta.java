
public abstract class Bicicleta implements Manejable{

	public void acelerar(int unidades) {
		System.out.println("Acelerar" + unidades);
	}

	public void frenar(int unidades) {
		System.out.println("Frenar" + unidades);
	}

    public abstract void demo();
	
	/*public void demo() {
		System.out.println("Mensaje desde demo");
	}*/
	
	public static void main(String[] args) {
		//Bicicleta bike1 = new Bicicleta();
		//bike1.demo();
		
		Manejable.mostrarLimiteVelocidad();
	}
}