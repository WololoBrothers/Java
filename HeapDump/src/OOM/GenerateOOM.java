package OOM;

public class GenerateOOM { 
    
	public void generateOOM() throws Exception { 
	        
	        int iteratorValue = 20; 
	        System.out.println("\n=================> OOM test iniciado..\n"); 
	        
	        for (int outerIterator = 1; outerIterator < 20; outerIterator++) { 
	            System.out.println("Iteracion " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory()); 
	            
	            int loop1 = 2; 
	            int[] memoryFillIntVar = new int[iteratorValue]; 
	            // llenar el array memoryFillIntVar en el loop.. 
	            
	            do { 
	                memoryFillIntVar[loop1] = 0; 
	                loop1--; 
	            } while (loop1 > 0); 
	  
	            iteratorValue = iteratorValue * 5; 
	            
	            System.out.println("\nMemoria requerida para proximo loop: " + iteratorValue); 
	            
	            Thread.sleep(1000); 
	        }
	}    

	public static void main(String[] args) {
		GenerateOOM oom = new GenerateOOM();
		try {
			oom.generateOOM();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
