import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Tel_50_CollectionWithInterface {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();  // Using Collection with generics will make sure to use only single type of variable to be inserted in List
		values.add(264);
		values.add(722);
		values.add(921);
		
		Collections.sort(values);   // Sorting in Ascending
		
		for (Object o : values)
		{
			
			System.out.println(o);
		}
	/*
	 * We would like to sort according to our need and not like from last number
	 * or first or middle..	
	 */
		
		Comparator <Integer> c =  new Comparator<Integer>() {
			public int compare(Integer i,Integer j)    // Anonymous class because Comparator is an interface
			{
				if(i%10>j %10)   // Last element sort
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(values,c );
		
		// Collections.sort(values, (i,j) -> i%10 > j%10?1:-1);
		
		for (Object o : values)
		{
			
			System.out.println(o);
		}

	}

}
