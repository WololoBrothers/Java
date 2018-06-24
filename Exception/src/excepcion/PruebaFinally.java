package excepcion;

public class PruebaFinally {

	public static void main(String[] args) {

		int result = 0;
		int val1 = 2;
		int val2 = 0;

		try {
			result = val1 / val2;			
		} catch (ArithmeticException e) {
			result = 0;			
		} finally {
			System.out.println(result);
		}
	}	
}