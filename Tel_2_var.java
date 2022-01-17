//Consider variable as a container in which data can be stored.
// For each values there's different variables types.
// int i = 5; means int -> datatype, i -> variable, 5 = value;
// int, float, double are primitive data types

public class Tel_2_var {
public static void main(String args[])
{	
	int a = 5; // it's a good practice too always use variable for reusablity
	// as java is a strictly type language means variable should be declared first
	System.out.println(a);	
	
	// $ and _ are allowed in variables
	// Numbers are allowed but they cannot come first.
	
	int $a=5;
	System.out.println($a);
	
	// in Java for decimal numbers by default is double.
	
	// To store in float you have to mention in explicitly.
	
	
	float f = 5f;
	System.out.println(f);
	
	// there are other datatypes too like short and byte for small number values to save memories
	// Long can be used for large numbers.
	long l  = 500000l;
	
	
	char c = 'S';
	c = 66; // It'll save the ASCII value of c.
	
	System.out.println(c);
	
	
	// Explicit conversion
	int k = (int)5.6;
	
	//Implicit conversion
	
	double d = 5;
	
}
}
//Conversion chart
//Byte -> Short  -> int -> long -> float -> double
//        Char --/



