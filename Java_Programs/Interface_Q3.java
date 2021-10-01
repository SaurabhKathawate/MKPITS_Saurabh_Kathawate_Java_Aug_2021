//In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.

interface Printable
{
    void print();
}

class Interface_Q3 implements Printable
{
	public void print(){System.out.println("Hello");}

	public static void main(String args[])
	{
		Interface_Q3 obj = new Interface_Q3();
		obj.print();
	}
}
