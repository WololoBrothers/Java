package simpsons;

public class Homero {
	
	private int peso;
	private int edad;
	private String hobby;
	
	void comer(String commida) {
		System.out.println("Hamburguesas");
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}