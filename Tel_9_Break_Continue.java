public class Tel_9_Break_Continue {

	
	public static void main(String []args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			
			System.out.println("value is "+i);
			
			if (i==9)
			{
				break;
			}
		}
		
	}
}
