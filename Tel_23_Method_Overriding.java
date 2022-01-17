
class Aa
{
public void show()
{
	System.out.println("in A");
	}
}

class Ab extends Aa
{
@Override    // This method here overrides method of super class
public void show()
{	super.show(); // calling super class method
	System.out.println("in B");
	}
}


public class Tel_23_Method_Overriding {
public static void main(String[] args) {
	Ab obj1 = new Ab();
	obj1.show();
}
}
