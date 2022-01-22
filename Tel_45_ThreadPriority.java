
public class Tel_45_ThreadPriority {
	public static void main(String[] args) throws Exception {
		Runnable obj1 =() ->
		{
	for(int i=1; i<=5;i++)
	{
		System.out.println("Hi");
		try{Thread.sleep(1000);   }
		catch (Exception e) {}
	}

		};
		
	Runnable obj2 =() ->
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(1000);   }
				catch (Exception e) {}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		System.out.println(t1.getPriority());
		
		t1.setPriority(10);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
		
		t1.join();  // Now this syso(bye) will run only after t1 and t2
		t2.join();
		
		System.out.println(t1.isAlive()); // to check if thread is still alive
		
		System.out.println("Bye!!!");

	}

}
