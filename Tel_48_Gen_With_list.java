import java.util.ArrayList;
import java.util.List;

public class Tel_48_Gen_With_list {

	public static void main(String[] args) {
		//List supports any type of data
		//List is mutable
		List<Integer> values = new ArrayList<Integer>();  // Using Collection with generics will make sure to use only single type of variable to be inserted in List
		values.add(4);
		values.add(5);
		values.add(6);
		
		for (Object o : values)
		{
			
			System.out.println(o);
		}
		
	}
}
