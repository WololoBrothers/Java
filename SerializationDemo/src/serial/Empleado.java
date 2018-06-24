package serial;

public class Empleado implements java.io.Serializable {

	public String nombre;
	public String direccion;	
	public int ID;
	
	public Empleado(String nombre, String direccion, int iD) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		ID = iD;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", direccion=" + direccion + ", ID=" + ID + "]";
	}	

}