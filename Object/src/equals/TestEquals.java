package equals;

public class TestEquals {

	public static void main(String[] args) {
		Homero h1 = new Homero("Homero Simpson", "Planta nuclear de Springfield", 110);
		Homero h2 = new Homero("Homero Simpson", "Planta nuclear de Springfield", 110);
		System.out.println(h1==h2);
		System.out.println(h1.equals(h2));
		h2.setNombre("Homero Thompson");
		System.out.println(h1==h2);
		System.out.println(h1.equals(h2));
	}	
}