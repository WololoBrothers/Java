public class EnumThread {

	public static void main (String [] args)
	{
		ThreadGroup system = null;
		ThreadGroup tg = Thread.currentThread().getThreadGroup();

		System.out.println("Thread group: " + tg.getName());
		Thread [] thds = new Thread [tg.activeCount ()];
		int nthds = tg.enumerate(thds);
		for (int i = 0; i < nthds; i++)
			System.out.println (thds [i] + " " + thds [i].isDaemon ());
				
		tg = tg.getParent();
		System.out.println("\nThread group: " + tg.getName());
		thds = new Thread [tg.activeCount ()];
		nthds = tg.enumerate (thds);
		for (int i = 0; i < nthds; i++)
			System.out.println (thds [i] + " " + thds [i].isDaemon ());		
	}
}