class Emp
{
	int eid;
	int salary;
	static String  ceo;
	
	/*
	 * To initialize a static variable while class is loaded
	 * static         // When you load a class and this only load once
	 * {
	 * ceo = "Larry";
	 * } 
	 * 
	 * public Emp()   // When you create an object
	 * {
	 * eid =1;
	 * salary = 3000;
	 * }
	 */
	
	
	
	public void show()
	{
		
		System.out.println(eid +" : "+salary+" : "+ceo);

	}
}

public class Tel_15_Static {
public static void main(String []args) {
	Emp navin = new Emp();
	navin.eid = 8;
	navin.salary = 4000;
	navin.ceo="Mahesh";
	
	Emp rahul = new Emp();
	rahul.eid = 9;
	rahul.salary = 5000;
	rahul.ceo="Mahesh";
	
	navin.show();
	rahul.show();
	
	
// now to make a data not an object specific you can make it static	
// so just directly use a class name hence also we can call main method
// directly without using an object.
	
Emp.ceo = "Nikita";

navin.show();
rahul.show();
}
}
