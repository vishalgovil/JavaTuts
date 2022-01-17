class Casios
{
	
int num1;
int num2;
String operation;

public Casios()
{
System.out.println("Default is called");	
}

public Casios(int a)
{
System.out.println("Single parameter is called");	
}

public Casios(int a, int b, String op)
{
System.out.println("Double parameter is called "+op);	
}
}

public class Tel_14_ConstructorOverloading {
public static void main(String args[])
{
	Casios obj = new Casios(4,5,"ab");
	Casios obj2 = new Casios(4);
	Casios obj3 = new Casios();
	
	}
}
