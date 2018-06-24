package methodinnerclass;

public class ClaseLocal {
	  
    static String regularExpression = "[^0-9]";
  
    public static void validarNumeroTel(String tel1, String tel2) {
      
        final int numberLength = 8;
                
        class NumeroTel {
            
            String NUmeroTelFormateado = null;

            NumeroTel(String NumeroTel){
                String currentNumber = NumeroTel.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength)
                    NUmeroTelFormateado = currentNumber;
                else
                    NUmeroTelFormateado = null;
            }

            public String getNumber() {
                return NUmeroTelFormateado;
            }
            
            // Valido desde JDK 8 en adelante:
            public void ImprimirNumOriginal() {
                System.out.println("Los numeros originales son " + tel1 + " y " + tel2);
            }
        }

        NumeroTel numero1 = new NumeroTel(tel1);
        NumeroTel numero2 = new NumeroTel(tel2);        

        if (numero1.getNumber() == null) 
            System.out.println("Primer numero es invalido");
        else
            System.out.println("Primer numero es " + numero1.getNumber());
        if (numero2.getNumber() == null)
            System.out.println("Segundo numero es invalido");
        else
            System.out.println("Segundo numero es " + numero2.getNumber());

    }

    public static void main(String[] args) {
    	validarNumeroTel("123-456-7890", "4512-7890");
	}
        
}