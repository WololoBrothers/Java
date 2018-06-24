package reflect;

import java.lang.reflect.Field;

public class ReflectDemo {

	String dato;
	
	public static void main(String[] args) {
		ReflectDemo demo = new ReflectDemo();
		Class cla = demo.getClass();
		Field[] fields = cla.getDeclaredFields();
		
		
		
	}
	
}
