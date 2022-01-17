//int, float, double
// Integer is a class
public class Tel_26_WrapperClass {
public static void main(String[] args) {
	int i=5; //Primitive Datatype
	Integer ii = new Integer(5);
	Float ff = new Float(3.4); // Boxing/ Wrapper Class
	int j = ii.intValue(); // to have the value of ii(Unboxing)
	
	Integer value = i; // AutoBoxing
	
	int k= value; // autounboxing
	
	
	String str = "123";
	
	int n = Integer.parseInt(str); // To convert String into Integer
	/*
	 * Certain frameworks like Hibernate and Collection API
	 * only works with wrapper class and not primitive datatypes
	 * 
	 */
}

}
