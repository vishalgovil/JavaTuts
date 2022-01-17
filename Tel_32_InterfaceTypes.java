//Types of Interface
// 1.Normal
// 2.Single abstract method - in Java 8 this is called functional interface 
// which will have only 1 function interface which helps implementing lambda
// 3.Marker Interface 


interface Fi
{void show();

	}
public class Tel_32_InterfaceTypes {
public static void main(String[] args) {
	Fi obj = () -> System.out.println("Im the best");
	
	obj.show();
}
}
