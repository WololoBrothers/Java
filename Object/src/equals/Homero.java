package equals;

public class Homero {
	String nombre;
	String trabajo;
	int peso;
	
	public Homero(String nombre, String trabajo, int i) {
		super();
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.peso = i;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object hom) {
		Homero h = (Homero) hom; 
		return h.getNombre().equals(this.getNombre());
	}
}