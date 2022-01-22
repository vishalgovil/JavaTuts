import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tel_47_CollectionDem {
public static void main(String[] args) {
	Collection values = new ArrayList();
	values.add(4);
	values.add(5);
	values.add(6);
	
	
	System.out.println(values);  // We cannot use index number in Collection
	
	Iterator it = values.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	
	
	List lvalues = new ArrayList();
	lvalues.add(4);    // These are just objects inside brackets hence can be used using Objects tooo I
	lvalues.add(5);      
	lvalues.add(6);
	lvalues.add(2,2);   // Index and element to insert in between
	
	for (int i=0; i<values.size();i++)
	{
		System.out.println(lvalues.get(i));
	}
	
	
	System.out.println(" Printing using Objects");
	for(Object o :lvalues)
	{
		System.out.println(o);
	}
	
	
	
}
}
