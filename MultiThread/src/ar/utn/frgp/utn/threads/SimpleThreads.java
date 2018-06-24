package ar.utn.frgp.utn.threads;

public class SimpleThreads {

	private static class MessageLoop implements Runnable {
		public void run() {
			String importantInfo[] = { "Primer mensaje",
					"Segundo mensaje", "Tercer mensaje",
					"Cuarto mensaje"};
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					System.out.println(importantInfo[i]);
					Thread.sleep(4000);				
				}
			} catch (InterruptedException e) {
				System.out.println("Aun no termine!");
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {
		long espera = 10000;

		System.out.println("Empezando el loop");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		System.out.println("Esperando a que el loop finalice");

		while (t.isAlive()) {
			System.out.println("Esperando...");
			Thread.sleep(1000);
			if (((System.currentTimeMillis() - startTime) > espera)
					&& t.isAlive()) {
				System.out.println("Cansado de esperar!");
				t.interrupt();
				//Thread.sleep(1000);
			}
		}
		System.out.println("Terminado!");
	}
}