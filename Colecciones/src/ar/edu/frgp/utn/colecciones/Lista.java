package ar.edu.frgp.utn.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Lista {
	
	public static void main(String[] args) {
		
		List <String> lista = new ArrayList<String>();
		lista.add("dato");
		lista.add("dato2");
		lista.add("dato3");
		
		lista.set(1, "asd");
		
		
		List <String> list2 = lista.subList(1, 3);
		//System.out.println(lista);
	
		Iterator<String> it = lista.iterator();
		
		
		
		/*while(it.hasNext()) {
			String dato = it.next();
			System.out.println(dato);
		}*/
		
		/*ListIterator<String> it2 = lista.listIterator(lista.size());
		
		while(it2.hasPrevious()) {
			String dato = it2.previous();
			System.out.println(dato);
		}
		
		for (ListIterator<String> it3 = lista.listIterator(lista.size()); it3.hasPrevious(); ) {
		    String t = it3.previous();		 
		}*/
		
		List <String> subLista  = lista.subList(0, 2);
		for (String object : subLista) {
			System.out.println(object);
		}
		
		/*Collections.fill(subLista, "lalala");
		System.out.println(subLista);*/
		
		Collections.swap(subLista, 0, 1);
		System.out.println(subLista);
		
		System.out.println(Collections.frequency(subLista, "dato"));
				
		
	}

}
