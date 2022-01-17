// Java doesn't support Multiple Inheritance
// Hence we use Interface for this
// Keyword for Interface is implements instead of extends
// Methods are not defined, they are called public abstract

interface Writer
{
	void write();  // this is a public abstract
	}
class Pen implements Writer
{public void write()  // Necessary add this
	{
	System.out.println("Im a pen");
	}
	}


class Pencil implements Writer
{public void write()
	{
	System.out.println("Im a pencil");
	}
	}
public class Tel_29_Interface {
	public void doSomething(Writer p)
	{
		p.write();
	}

}
