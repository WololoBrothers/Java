package ComparableDemo;

import java.util.Arrays;

public class OrdenSimpsons {

	public static void main(String[] args) {
		
		Simpson []simpsons = new Simpson[4];
		Simpson hom = new Simpson("Homer", "Homero Simpson", 2);
		Simpson mar = new Simpson("Marge", "Marge Simpson", 3);
		Simpson lis = new Simpson("Lis", "Lisa Simpson", 1);
		Simpson bar = new Simpson("Bart", "Bart Simpson", 4);
		
		
		simpsons[0]=hom;
		simpsons[1]=mar;
		simpsons[2]=lis;
		simpsons[3]=bar;
		
		Arrays.sort(simpsons);
		
		for (Simpson simpson : simpsons) {
			System.out.println(simpson.getNombre() + "  cantidad: " + simpson.getCantidad() );
		}
	}
	
}