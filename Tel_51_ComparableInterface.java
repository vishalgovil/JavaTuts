import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Stud implements Comparable<Stud>
{
	
int rollno, marks;
String name;
public Stud(int rollno,  String name,int marks) {
	super();
	this.rollno = rollno;
	this.marks = marks;
	this.name = name;
}


@Override
public String toString() {
	return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
}

public int compareTo(Stud s)
{
	//return marks > s.marks?1:-1;  // Based on marks
	return name.length()>s.name.length()?1:-1; // Sorting based on name length
	}



}
public class Tel_51_ComparableInterface {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Vishal", 99));
		studs.add(new Stud(24,"Harry", 88));
		studs.add(new Stud(25,"Hermione", 85));
		studs.add(new Stud(30,"Ron", 100));
		
		Collections.sort(studs);
		//Collections.sort(studs,(i,j) ->i.marks>j.marjs?1:-1);  This'll overwrite the above logic and will sort on marks
		for(Stud s : studs)
		{
			
			System.out.println(s);
		}
		
	}
}
