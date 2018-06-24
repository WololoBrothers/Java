package excepcion;

public class Calculos {
	
	int ejecutarCalculoDivision(int num1, int num2) throws ArithmeticException{
		if(num2 == 0 ) 				
				throw new ArithmeticException("Intento de division por 0");	
		int result = num1 / num2;
		return result;
	}
	
	void realizarcalculo(int val1, int val2, String operacion) {
		int result = 0;
		try {
			if (operacion == "division")
				result = ejecutarCalculoDivision(val1, val2);
		} catch (ArithmeticException e) {
			val2 = 1;
			System.out.println("Excepcion gestionada");
			result = ejecutarCalculoDivision(val1, val2);
		} finally {			
			System.out.println(result);
		}		
	}
	
	public static void main(String[] args) {		
			int val1 = 4;
			int val2 = 0;
			Calculos calc = new Calculos();
			calc.realizarcalculo(val1, val2, "division");					
	}
}