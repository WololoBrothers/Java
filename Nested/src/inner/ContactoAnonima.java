package inner;

public class ContactoAnonima {
	
	private String numero;

	datosContacto cont = new datosContacto() {
		
		@Override
		public boolean validar(String numero) {
			if(numero.length()!=extension)
			return false;
			else {
				return true;
			}
		}
	};
	
}
