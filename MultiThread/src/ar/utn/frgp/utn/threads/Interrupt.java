package ar.utn.frgp.utn.threads;

public class Interrupt implements Runnable{
	static String cuatroMensajes[] = { "Primer mensaje", "Segundo mensaje",
			"Tercer mensaje", "Cuarto mensaje" };

	public static void main(String args[]) throws InterruptedException {
		Interrupt i1 = new Interrupt();
		Thread t1 = new Thread(i1);
		t1.setName("Primer Thread");
		t1.start();
		Thread.sleep(1000);
		t1.interrupt();
		Thread t2 = new Thread(i1);
		t2.setName("Segundo Thread");
		t2.start();
	}

	public void run(){
		try {
			for (int i = 0; i < cuatroMensajes.length; i++) {
				System.out.println(cuatroMensajes[i] + " desde: " + Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrumpido");
			e.printStackTrace();
		}
	}
}