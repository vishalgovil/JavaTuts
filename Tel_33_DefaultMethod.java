// In abstract class we can both define and declare method
// You cannot do that in Interface 
// So from java 1.8 define method is also allowed 
@FunctionalInterface
interface Demo
{
	void abc();			//Functional interface can have only 1 abstract method
	default void show() // public void show will give error while defining in interface
	{
		System.out.println("in Demo show");
	}
	
	
}


interface MyDemo
{
	default void show() // public void show will give error while defining in interface
	{
		System.out.println("in myDemo show");
	}
}
class DemoImp implements Demo, MyDemo
{
	public void abc()
	{
		
		System.out.println("In abc");
	}
	
	public void show()				// as Show is in both demo and mydemo without this it'll give show method errorr
	{
		System.out.println("In new show");
	}
	
	/* METHOD 2
	 * public void show()
	 * {
	 * MyDemo.super.show(); This can be generated automaticaly too.
	 * }
	 */
}

public class Tel_33_DefaultMethod {
public static void main(String[] args) {
	Demo obj = new DemoImp();
	obj.abc();
	obj.show();
}
}
