package nested;

public class ClaseAnonima {

	public static void main(String[] args) {
		
		InterfaceAnonima anon = new InterfaceAnonima(){
			@Override
			public void saludar() {
				System.out.println("mensaje desde clase anonima");
			}

			@Override
			public void segundoSaludo() {
				// TODO Auto-generated method stub
				
			}
		};
		
		anon.saludar();
		
	}
	
}
