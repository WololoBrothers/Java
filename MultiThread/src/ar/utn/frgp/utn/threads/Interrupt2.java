package ar.utn.frgp.utn.threads;

public class Interrupt2 implements Runnable{

	@Override
	public void run()  {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " from thread: " + Thread.currentThread().getName());
				if (Thread.interrupted()){
					throw new InterruptedException();		
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Interrumpido");				
		}
	}

	public static void main(String[] args) {

		Interrupt2 e3 = new Interrupt2();

		Thread t1 = new Thread(e3);
		Thread t2 = new Thread(e3);

			/*try {*/
				t1.start();
				t1.interrupt();
				//t1.join();				
				t2.start();
			/*} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
	}
}