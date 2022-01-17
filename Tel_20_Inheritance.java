/*
 * IS-A , HAS-A
 * Extends -> IS-A
 * Tel_20_Inheritance -> HAS-A
 * 
 *Java doesn't support multiple inheritance
 */


class Calculator					//Super, Parent, Base
{
	
	public int add(int i, int j) {
		return i + j;
	}
}

class CalcAdv extends Calculator  // Sub, Child, Derived
{
	
public int sub(int i, int j)
{
	
return i-j;
}
}

class CalcVeryAdv extends CalcAdv
{
public int mul(int i, int j)
{
return i*j;	
}

}
public class Tel_20_Inheritance {
	
public static void main(String[] args) {
	CalcVeryAdv obj1 = new CalcVeryAdv();
	
	System.out.println(obj1.add(5,6));
	System.out.println(obj1.sub(5,6));
	System.out.println(obj1.mul(5,6));
	
}
}
