class Calcul
{
	
	int num1;
	int num2;
	int result;
	
	public Calcul(int num1, int num2)
	{
		this.num1 =num1;
		this.num2 = num2;
		
	}
}

public class Tel_12_This_Keyword {
public static void main(String args[])
{
Calcul obj = new Calcul(4,5);

System.out.println(obj.num1);
System.out.println(obj.num2);

}
}
