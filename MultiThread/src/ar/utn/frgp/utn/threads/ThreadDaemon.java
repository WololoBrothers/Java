public class DaemonThreads implements Runnable{

	@Override
	public void run() {
			System.out.println("Hola desde Thread: " 
				+ Thread.currentThread().getName());
			if (Thread.currentThread().isDaemon() == true){				
				try {
					Thread.sleep(1000);
					System.out.println("Salida desde Daemon");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	
	public static void main(String[] args) {
		
		DaemonThreads d1 = new DaemonThreads();
		
		Thread t1 = new Thread(d1, "Thread 1");
		Thread t2 = new Thread(d1, "Thread 2");
		Thread t3 = new Thread(d1, "Thread 3");
		
			try {
				t1.start();
				Thread.sleep(1000);				
				t2.start();
				Thread.sleep(1000);
				t3.setDaemon(true);
				t3.start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
									
	}
}