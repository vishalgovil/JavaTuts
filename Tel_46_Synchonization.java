class Counter2
{
	
	int count;
	public synchronized void increment() //Without this count variable value might update in between syncronized make sure only one method works with this method 
	{
		count++;
	}
}


public class Tel_46_Synchonization {
public static void main(String[] args) throws Exception {
	Counter2 c = new Counter2();
	
	Thread t1 =  new Thread(new Runnable()
			{
		public void run()
		{
			
			for(int i=1; i<=1000; i++)
			{
				c.increment();
			}
		}
			});
	
	Thread t2 =  new Thread(new Runnable()
	{
public void run()
{
	
	for(int i=1; i<=1000; i++)
	{
		c.increment();
	}
}
	});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
	System.out.println(c.count);
		
}
}
