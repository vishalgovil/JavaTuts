// Once class is Abstract it's object cannot be created
// Number class is a good example of abstract class.
abstract class Human
{
public abstract void eat(); // If using abstract in method then class 
// should be an abstract class too.


public void walk()
{
	
}

}

class Men extends Human
{
public void eat() // Implemet abstract methods
{
	}
}
public class Tel_27_Abstract {

	public static void main(String[] args) {
		//Human obj = new Human(); // as the Human is abstract class this'll give error.
		Human obj = new Men(); //This'll work
	}
}
