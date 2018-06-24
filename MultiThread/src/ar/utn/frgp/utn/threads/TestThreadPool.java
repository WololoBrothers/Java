import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  

public class TestThreadPool {  
	public static void main(String[] args) {  
		ExecutorService executor = Executors.newFixedThreadPool(3);		
		String tareas [] = {"Remachar", "Martillar", "Pintar", "Soldar", "Atornillar", "Destornillar"};
		Thread trabajador;
		for (int i = 0; i < tareas.length ; i++) {  			
			trabajador = new Thread(new HiloTrabajador("" + tareas[i]));
			executor.execute(trabajador);
		} 
		executor.shutdown();
		evaluarFin2(executor);
	}

	private static void evaluarFin2(ExecutorService executor) {
		while (true){
			if( executor.isTerminated() ){
				System.out.println("Los trabajadores terminaron el dia de trabajo");
				System.exit(0);
			}
		}
	}

	private static void evaluarFin(ExecutorService executor) {
		try {
			Thread.sleep(5000);
			if( executor.isTerminated() )
				System.out.println("Los trabajadores terminaron el dia de trabajo");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}