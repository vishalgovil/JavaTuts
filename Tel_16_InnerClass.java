class Outer
{
	int a;				// member variable
	public void show() //member method
	{
	
	}
	
	class Inner //member class  Outer$Inner.class
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
	
	static class Inner2 // Static Class
	{
		public void display()
		{
			System.out.println("In Static");
		}
		
	}
}

public class Tel_16_InnerClass {
// variable // methods

public static void main (String args[])
{
	Outer obj = new Outer();
	obj.show();
	
	Outer.Inner obj1 =  obj.new Inner();  // Making an object of Inner class
	
	obj1.display();
	
	Outer.Inner2 obj2 =  new Outer.Inner2();  // Making an object of Static Inner2 class
	
	obj2.display();
	
	
}	
}
