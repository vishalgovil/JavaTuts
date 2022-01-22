import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tel_49_CollectionsClass {
public static void main(String[] args) {
	List<Integer> values = new ArrayList<Integer>();  // Using Collection with generics will make sure to use only single type of variable to be inserted in List
	values.add(4);
	values.add(5);
	values.add(6);
	
	Collections.sort(values);   // Sorting in Ascending
	Collections.reverse(values); // Sorting in Descending
	Collections.shuffle(values); // Randomly Shuffling the values
	
	
	for (Object o : values)
	{
		
		System.out.println(o);
	}

}
}
