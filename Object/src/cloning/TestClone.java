package cloning;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Lisa l1 = new Lisa("Estatal de Springfield", 9, 9.5);
		Lisa l2;
		l2 = (Lisa) l1.clone();
		l2.listarDatos();
		System.out.println(l2.toString());
	}	
}