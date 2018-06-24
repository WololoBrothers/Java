package inner;

public class ContactoLocal {
	
	private void mensaje() {
		
		class Mensajeria{
			
			void salidaPorPantalla() {
				System.out.println("Salida desde clase interna de metodo");
			}
			
		}
		
		Mensajeria men = new Mensajeria();
		men.salidaPorPantalla();
		
	}
	
	public static void main(String[] args) {
		ContactoLocal cont = new ContactoLocal();
		cont.mensaje();
	}

}
