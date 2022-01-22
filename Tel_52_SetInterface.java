import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Difference b/w list and set is Set will have only unique elements see below.
 * 
 */
public class Tel_52_SetInterface {
public static void main(String[] args) {
	
	Set<Integer> values = new HashSet<>();
	// HashSet will use heap memory hence the sequence might be different from inserted sequence
	// It'll fetch the nearest memory first.
	values.add(5);
	values.add(6);
	values.add(9);
	values.add(6);  // It'll not add 6 as it doesn't support duplicate values.
	 
	
	for(int i :values)
	{
		System.out.println(i);
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	
	Set<Integer> valuesT =  new TreeSet<>();
	/*
	 * TreeSet also allows only unique values but it maintains the Sequence in Ascending Order.
	 */
	valuesT.add(5);
	valuesT.add(9);
	valuesT.add(6);

	valuesT.add(6);
	
	for(int i :valuesT)
	{
		System.out.println(i);
	}
	
	
	
}
}
