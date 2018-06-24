package WrapperIntro;

public class WrapperDemo {

	public static void main (String args[]){
		Integer intObj1 = new Integer (25);
		Integer intObj2 = new Integer ("25");
		Integer intObj3= new Integer (35);
	
		//compareTo
		System.out.println("Comparacion compareTo entre Obj1 y Obj2: " + intObj1.compareTo(intObj2));
		System.out.println("Comparacion compareTo Obj1 y Obj3: " + intObj1.compareTo(intObj3));
		
		//Equals 
		System.out.println("Comparacion equals entre Obj1 y Obj2: " + intObj1.equals(intObj2));
		System.out.println("Comparacion equals entre Obj1 y Obj3: " + intObj1.equals(intObj3));
		
		Float f1 = new Float("2.25");
		Float f2 = new Float("20.43");
		Float f3 = new Float(2.25);
		System.out.println("Comparacion compare entre f1 and f2: " + Float.compare(f1,f2));
		System.out.println("Comparacion compare entre f1 and f3: " + Float.compare(f1,f3));
		
		//Suma de Integer y Float
		Float f = intObj1.floatValue() + f1;
		System.out.println("Suma de intObj1 a f1: "+ intObj1 +"+" +f1+ " = " +f );
		
		//Parseo de String a Integer
		int dato = Integer.parseInt("2");
		System.out.println(dato);
	}
}  