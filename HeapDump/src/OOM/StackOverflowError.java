package OOM;

public class StackOverflowError {
	
	static void recursivo() {
		recursivo();
	}
	
	public static void main(String[] args) {
		
		try{
			recursivo();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
