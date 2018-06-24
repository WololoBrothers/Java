package ar.utn.frgp.utn.threads;

public class JoinThreads implements Runnable{

	public void run() {
		try {
			for(int i=1; i<=10;i++){	
				System.out.print(i + " "+ Thread.currentThread().getName()+"\n");				
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//System.out.println("Finalizo el hilo " + Thread.currentThread().getName() );


	public static void main(String[] args) throws InterruptedException{
		{
			JoinThreads j1 = new JoinThreads();

			Thread hilo2 = new Thread(j1);
			hilo2.setName("Hilo2");
			hilo2.start();
			Thread.sleep(500);
			hilo2.interrupt();

			Thread hilo1 = new Thread(j1);
			hilo1.setName("Hilo1");
			hilo1.start();

		}
	}
}