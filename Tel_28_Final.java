class Af
{

	final int I=20;
	public Af()
	{
//		i=10; This is not allowed as variable i is constant
	}
	
	// to stop method from being override in base class final can be used
	public final void show()
	{
		System.out.println("Display");
	}


}
public class Tel_28_Final {
public static void main(String[] args) {
	Af obj  = new Af();
	obj.show();
	System.out.println(obj.I);
}
}
