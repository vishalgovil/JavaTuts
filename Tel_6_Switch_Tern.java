public class Tel_6_Switch_Tern {
public static void main(String args[])
{
int i=8;
int j=0;

if(i>6)
{
	j=1;
}
else
{j=2;
	}
	

j = i>6?1:2;
// Ternary version of above if-else-code

System.out.println(j);

// Switch will be usefule when there are multiple if-else
// Switch only supports string(above 1.7), char and integer
int n=4;

switch(n)
{
case 1:
	System.out.println("One");
	break;
case 2:
	System.out.println("Two");
	break;
case 3:
	System.out.println("Three");
	break;
case 4:
	System.out.println("Four");
	break;
default:
	System.out.println("No Match");
}







}
}