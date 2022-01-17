class A
{
	public A() 
	{
		System.out.println("in A");
	}
	
	public A(int i)
	{
		System.out.println("in A int");
	}
	
	}

class B extends A
{
	public B()
	{
		
		System.out.println("in B");
	}
	
	
	public B(int i)
	{
	//	super(i); //to call parameterized of A
		System.out.println("in B int");
	}
	}
public class Tel_21_Super {
public static void main(String[] args) {
	B obj1 = new B(5);
	// It'll call the default of super class and parameterized of B
}

//Whenever a constructor of class B is called a const of Super class is also called
}
