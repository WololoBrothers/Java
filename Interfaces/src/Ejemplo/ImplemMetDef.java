package Ejemplo;

public class ImplemMetDef implements Figura{
	
	public void dibujar(int color) {
		System.out.println("Dibujando en clase ImplemMetDef");
	}
	
	public static void main(String[] args) {
		ImplemMetDef imp = new ImplemMetDef();
		imp.dibujar(RED);
	}
}