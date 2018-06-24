package ar.utn.frgp.utn.threads;

class ThreadGroup3
{
   public static void main (String [] args)
   {
      ThreadGroup tg = new ThreadGroup ("subgrupo 1");
      Thread t1 = new Thread (tg, "Thread 1");
      Thread t2 = new Thread (tg, "Thread 2");
      Thread t3 = new Thread (tg, "Thread 3");
 
      tg = new ThreadGroup ("subgrupo 2");
      Thread t4 = new Thread (tg, "Thread 4");
      
      //tg = Thread.currentThread().getThreadGroup ();
      
      int agc = tg.activeGroupCount ();      
      System.out.println ("Active thread groups in " + tg.getName () +
                          " thread group: " + agc);
      tg.activeCount()
      tg.list();           
   }
}