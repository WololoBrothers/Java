package ComparableDemo;

public class Simpson implements Comparable<Simpson>{

	private String apodo;
	private String nombre;
	private int cantidad;
	
	public Simpson(String apodo, String nombre, int cantidad) {
		super();
		this.apodo = apodo;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	
	public int compareTo(Simpson compareSimpsons) {
		
		int compareCantidad = ((Simpson) compareSimpsons).getCantidad(); 
		
		//Orden ascendiente
		//return getCantidad() - compareCantidad;
		
		//Orden descendiente
		return compareCantidad - getCantidad();
		
	}
	
}