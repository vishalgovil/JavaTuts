
class Calc
{
	int num1;
	int num2;
	int result;

	
	public void perform()
	{
		result  = num1 + num2;
	}
}



public class Tel_10_Class_Object {

	public static void main(String args[])
	{
		
		Calc obj/*ref*/ = new/*Assign Memory*/ Calc()/*Constructor*/; //Knows Something and does Something
		
		obj.num1=3;
		obj.num2=5;
		
		obj.perform();
		System.out.println(obj.result);
	}
}
