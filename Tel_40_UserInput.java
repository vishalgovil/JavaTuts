import java.util.Scanner;

public class Tel_40_UserInput {
public static void main(String[] args) {
	int n =0;
	System.out.println("Enter a number");
	
	Scanner sc =  new Scanner(System.in);
	n = sc.nextInt(); // This'll take Int as input
	System.out.println("Input number is "+n);
	
	sc.close();
}
}
