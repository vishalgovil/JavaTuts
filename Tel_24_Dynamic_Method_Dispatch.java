class Ac
{
public void show()
{
	System.out.println("in A");
	}
}

class Ad extends Ac
{

public void show()
{	 
	System.out.println("in B");
	}
}

class Ae extends Ac
{
	public void show()
	{	
		System.out.println("in B");
		}
	public void config()
	{
		
		System.out.println("Config");
	}
	

}
public class Tel_24_Dynamic_Method_Dispatch {
	public static void main(String[] args) {
		Ac obj1 = new Ad();   // EVEN THIS IS POSSIBLE (Run time polymorphism)
	
		obj1.show(); // Calling show function of B
		
//		Ac obj2 = new Ae();
//		obj2.config(); This will not work as even Ae function will be called
//		config should also be in Ac (Parent class)
		
		obj1 = new Ae();
		obj1.show();   // Dynamic Method Dispatch
		
	
	}
}
