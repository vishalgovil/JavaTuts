//BINDING DATA WITH METHODS
// Enacpsulation makes data safe
class Student
{
	int rollno;
	String name;
	
	// Getters and Setters
	
	public void setRollno(int r)
	{
		rollno = r;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno()
	{
		return rollno;
	}
}


public class Tel_25_Encapsulation {
public static void main(String[] args) {
	Student s1 =  new Student();
	
	s1.setRollno(2);
	s1.setName("NAVIN");
	
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	
}
}
