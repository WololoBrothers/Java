package Herencia;

public class SuperClase {
	
	void display() {
		System.out.println("Mensaje desde super clase");
	}

}

class SubClase extends SuperClase{
	void display() {
		System.out.println("Mensaje desde sub clase");		
	}
	
	void metodoInvocador() {		
		//Invocacion de metodo clase actual
		display();
		//Invocacion de metodo en superclase
		super.display();
	}
	
	public static void main(String[] args) {
		SubClase sub = new SubClase();
		
		//No se puede hacer referencia a la clase padre desde un contexto estático
		//super.display();
		sub.metodoInvocador();
	}
}
