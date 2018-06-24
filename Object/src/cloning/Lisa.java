package cloning;

public class Lisa implements Cloneable{
	String escuela;
	Integer edad;
	Double promedio;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Lisa(String escuela, Integer edad, double d) {
		super();
		this.escuela = escuela;
		this.edad = edad;
		this.promedio = d;
	}
	
	public void listarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Escuela: " + escuela);
		System.out.println("Edad: " + edad);
		System.out.println("Promedio: " + promedio);
	}
}