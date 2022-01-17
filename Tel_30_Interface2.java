
interface Abcd
{void show();
	}
class Implementor implements Abcd
{
	public void show()
	{
		System.out.println("Anything");
	}
	}
public class Tel_30_Interface2 {
public static void main(String[] args) {
	//Abcd obj = new Abcd(); you can create reference but not an object of Abc
	Abcd obj = new Implementor();
	obj.show();
}
}
