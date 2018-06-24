package OOM;

public class Recursivo {
	
	static void metodorecursivo() {
		metodorecursivo();
	}
	
	public static void main(String[] args) {
		
		try{
			metodorecursivo();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
