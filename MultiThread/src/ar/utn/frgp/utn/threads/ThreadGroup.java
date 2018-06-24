public class ThreadGroupExample implements Runnable{

	public void run() {
		saludar();
	}

	private synchronized void saludar() {
		try {
			System.out.println("Hola desde Hilo: " + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("Adios desde Hilo: " + Thread.currentThread().getName());			
			notify();
		} catch (InterruptedException e) {
			System.out.println("Hilo: " + Thread.currentThread().getName() + " Interumpido");
		}
	}

	private synchronized void esperar(ThreadGroup tg1) {
		try {
			while(tg1.activeCount() != 0){
				wait();
			}
			System.out.println("Terminaron los hilos");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		ThreadGroupExample tge1 = new ThreadGroupExample();

		ThreadGroup tg1 = new ThreadGroup("Grupo de hilos");

		Thread t1 = new Thread(tg1, tge1, "Hilo 1");
		Thread t2 = new Thread(tg1, tge1, "Hilo 2");
		Thread t3 = new Thread(tg1, tge1, "Hilo 3");

		t1.start();
		t2.start();
		t3.start();

		tge1.esperar(tg1);

	}
}