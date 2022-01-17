class Abc
{
public int add(int ... n)// as an array
	{
	int sum=0;
	for(int i:n)
	{
		sum+=i;
	}
	return sum;
	}

}


public class Tel_19_varags {
public static void main(String[] args) {
	Abc obj = new Abc();
	System.out.println(obj.add(2,3,8,11,90,55));
}
}
