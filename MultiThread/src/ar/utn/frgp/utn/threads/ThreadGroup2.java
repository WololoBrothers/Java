public class ThreadGroupExample2 implements Runnable{

	public void run() {
		saludar();
	}

	private synchronized void saludar() {
		try {
			System.out.println("Hola desde: " + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("Adios desde: " + Thread.currentThread().getName());			
		} catch (InterruptedException e) {
			System.out.println("Hilo: " + Thread.currentThread().getName() 
				+ " Interumpido");
		}
	}  

	public static void main(String[] args) {  
		ThreadGroupExample2 tge2 = new ThreadGroupExample2();  
		ThreadGroup tg1 = new ThreadGroup("Grupo de hilos");  

		Thread t1 = new Thread(tg1, tge2,"Hilo 1");  
		t1.start();  
		Thread t2 = new Thread(tg1, tge2,"Hilo 2");  
		t2.start();  
		Thread t3 = new Thread(tg1, tge2,"Hilo 3");  
		t3.start();  
		
		System.out.println("Nombre de grupo de hilos: " + tg1.getName());			
		tg1.interrupt();  

	}  
}