package ar.utn.frgp.utn.threads;

public class ThreadPriority implements Runnable{
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName() + " y prioridad: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread hilo1 = new Thread(new ThreadPriority(), "Hilo 1");
		Thread hilo2 = new Thread(new ThreadPriority(), "Hilo 2");
		Thread hilo3 = new Thread(new ThreadPriority(), "Hilo 3");
		hilo1.setPriority(Thread.MIN_PRIORITY);
		hilo2.setPriority(Thread.MAX_PRIORITY);
		hilo3.setPriority(Thread.MIN_PRIORITY);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}