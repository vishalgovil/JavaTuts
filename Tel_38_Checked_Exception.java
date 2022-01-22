/*
 * Checked exceptions are those exceptions that are checked by the java compiler itself at compilation time and are not under runtime exception class hierarchy
 * 
 * Unchecked exceptions in Java are those exceptions that are checked by JVM, not by java compiler. 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tel_38_Checked_Exception {
public static void main(String[] args)  throws Exception { //without this it wouldn't have run
	System.out.println("Enter a number");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine()); 
	
	br.close();
	// br.readLine is a checked exception
	
	System.out.println(n);
}
}
