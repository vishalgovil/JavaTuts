interface StatDemo
{
int num=8;   // inside a interface a variable is bydefault a constant
void abc();
static void show()
{
	System.out.println("hi");
	}
}

class DemoImp implements StatDemo
{
	public void abc()
	{
	num =9;	 // This'll give error as num is a final variable
	}

}
public class Tel_34_StaticMethodInterface {
public static void main(String[] args) {
	
}
}
