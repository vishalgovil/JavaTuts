/*
 * Member Method
 * Same name as Classname
 * Don't return anything
 * Will be used to allocate memory
 * There are many types of Constructor like default, copy and parameterized
 */

class Calcu
{
	
	int num1;
	int num2;
	int result;
	
	public Calcu()
	{
		num1 =5;
		num2 = 5;
		
	}
	
	public Calcu(int n)
	{
		num1 = n;
		num2 = n;
	}
}


public class Tel_11_Constructor {

	public static void main(String args[])
	{
		Calcu obj = new Calcu();
		System.out.println(obj.num1);
		
		Calcu obj2 = new Calcu(7);  //Passing value 
		System.out.println(obj2.num1);
		
		
	}
}
