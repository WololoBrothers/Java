package modificadoresAcceso;

public class DemoProtegido2 {

	public static void main(String[] args) {
		DemoProtegido2 d2 = new DemoProtegido2();
		d2.metodoAcceso();
	}
	
	void metodoAcceso() {
		DemoProtegido d = new DemoProtegido();
		d.datoProtegido = 100;
		d.metodoProtegido();
	}
	
}
