public class SleepMessages {
    public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = { 
            "primer mensaje",
            "segundo mensaje",
            "tercer mensaje",
            "cuarto mensaje"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pausar por 2 segundos
            Thread.sleep(2000);
            //Imprimir mensaje
            System.out.println(importantInfo[i]);
        }
    }
}