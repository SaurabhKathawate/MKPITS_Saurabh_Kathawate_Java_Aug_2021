//Runtime Polymorphism in Java
//Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
//In this process, an overridden method is called through the reference variable of a superclass.

//creating parent class
class parent
{
	void display()
	{
		System.out.println("hello from parent class display method");
	}
}

//creating child class
class child extends parent {
	//overriding base class display method
	void display()
	{
		System.out.println("hello from child class display method");
	}
}

class Polymorphism_Q1
{
	public static void main(String[] arg)
	{
		//child c=new child();
		parent p=new child();; // c is reference variable of super class parent
		p.display();
	}
}
