package ar.utn.frgp.utn.threads;

public class InconsistenciaMemoriaThread implements Runnable{
	static Integer variable = 0;	
	public void run() {		
		variable++;
		System.out.println(variable);
	}	
	public static void main(String[] args) {
		Thread t1 = new Thread(new InconsistenciaMemoriaThread());
		Thread t2 = new Thread(new InconsistenciaMemoriaThread());		
		t1.start();
		t2.start();
	}	
}