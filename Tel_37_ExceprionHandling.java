/*
 * There are many exceptions like arithmetic, index out of bound you can directly 
 */

public class Tel_37_ExceprionHandling {

	public static void main(String[] args) {
		try {
		System.out.println("Bye before error"); //This'll be printed
		int i = 9/0;   //This'll be visible at runtime
		System.out.println("Bye after error"); //This'll not be printed
		}
		catch(Exception e) // This'll only work if the associated try has error
		{
			System.out.println("Error ");
			System.err.println("Error ");
		
		}
		/*
		 * If you are having multiple exceptions then catch(Exception e) should be the last one
		 */
		finally
		{
			
			System.out.println("Bye");
		}
		
	}
	
}
