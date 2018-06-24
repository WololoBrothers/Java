package ar.utn.frgp.utn.threads;

public class InterferenciaThreads implements Runnable{	
	private int c = 0;
	public synchronized void increment() { 
		c++; 
		System.out.println(Thread.currentThread().getName() + ": valor: " + c);
	} 
	public synchronized void decrement() { 
		c--;
		System.out.println(Thread.currentThread().getName() + ": valor: " + c);
	} 
	public synchronized int value() { 
		return c; 
	} 	    	    
	public void run() {		
		if (Thread.currentThread().getName()=="t1"){
			increment();			
		}
		else{
			decrement();			
		}
	}
	public static void main(String[] args) {
		InterferenciaThreads i1 =  new InterferenciaThreads();
		Thread t1 = new Thread(i1);
		Thread t2 = new Thread(i1);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		/*try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName() + ": valor: " + i1.value());		
	}
}