package ar.edu.frgp.utn.colecciones;
import java.util.*;

public class Sets {

	public static void main(String[] args) {
		
		Set setA = new HashSet();
		setA.add("element 0");
		setA.add("element 1");
		setA.add("element 2");
		//access via Iterator
		Iterator iterator = setA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		}
		//access via new for-loop
		for(Object object : setA) {
		    String element = (String) object;
		}
		
		Set setB = new HashSet();
		Set setC = new LinkedHashSet();
		Set setD = new TreeSet();

		
	}
}