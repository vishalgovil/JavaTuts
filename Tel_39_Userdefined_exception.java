
public class Tel_39_Userdefined_exception {
public static void main(String[] args) {
	
	int i,j;
	i=8;
	j=9;
	try
	{
		int k = i/j;
		if(k==0)
			throw new VishException("This is a messge passing example");
	}
	
	catch(VishException e)
	{
		System.out.println("Error "+ e.getMessage());
	}
}
}
