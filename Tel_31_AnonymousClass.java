class Ag
{
public void show()
{
	System.out.println("In A show");
	}
}

interface Anonymous
{ void show();
	}


public class Tel_31_AnonymousClass {
public static void main(String[] args) {
	Ag obj = new Ag()
			
			{
		public void show()   // Anonymous class
		{
			System.out.println("Im the best");
		}
			};
	obj.show(); // This'll override the method
	
	Anonymous obj1 = new Anonymous()  // Generally object of interface cannot be created but as this we can create 
			{
			public void show()
			{
				System.out.println("Im the best");
			}
		
			};
	obj1.show();
}
}
