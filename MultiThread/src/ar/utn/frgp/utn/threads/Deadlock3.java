package ar.utn.frgp.utn.threads;

public class Deadlock3 implements Runnable{
	private final String name;
	final static Deadlock3 alphonse = new Deadlock3("Alphonse");
	final static Deadlock3 gaston = new Deadlock3("Gaston");

	public Deadlock3(String name) { this.name = name;	}

	public String getName() { return this.name; }

	public synchronized void bow(Deadlock3 bower) {		
		System.out.println(this.name + ": " + bower.getName() + " me saludo! ");
		bower.bowBack(this);
	}

	public synchronized void bowBack(Deadlock3 bower) {
		System.out.println(this.name + ": " + bower.getName() + " me respondio! ");		
	}
	
	public void run() {
		if (this.name == "Alphonse" ){
			bow(gaston);
		}
		if (this.name == "Gaston" ){
			bow(alphonse);
		}			
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(alphonse);
		Thread t2 = new Thread(gaston);
		t1.start();
		t2.start();
	}
}