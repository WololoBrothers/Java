public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        HelloRunnable hr = new HelloRunnable();
        Thread t1 = new Thread(hr);
        t1.start();
    }
}