class HiloTrabajador implements Runnable {  
    
	private String message;  
    
	public HiloTrabajador(String s){  
        this.message=s;  
    }  
    
	public void run() {  
        System.out.println(Thread.currentThread().getName()
            +" (Inicio) del trabajo = "+ message);  
        jornadaLaboral();
        System.out.println(Thread.currentThread().getName()
            +" (Fin) del trabajo = " + message);  
    }  
    
	private void jornadaLaboral() {  
        try {  
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
    }  
}