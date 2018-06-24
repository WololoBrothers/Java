package Cloning;

public class Simpson implements Cloneable{
	
	String Nombre;
	String Apellido;
	public Simpson(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
    public Object clone()throws CloneNotSupportedException{  
		return (Simpson)super.clone();  
	}
	
	public static void main(String[] args)  {
		Simpson hom = new Simpson("Homer", "Simpson");
		try {
			Simpson hom2 = (Simpson) hom.clone();
			hom.Nombre = "Marge";
			System.out.println(hom.getNombre() + " "+ hom.getApellido());
			System.out.println(hom2.getNombre() + " "+ hom2.getApellido());
			hom2 = hom;
			hom.Nombre = "Lisa";
			System.out.println(hom.getNombre() + " "+ hom.getApellido());
			System.out.println(hom2.getNombre() + " "+ hom2.getApellido());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}