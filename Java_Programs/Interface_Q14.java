interface Printable{
     void print();
     interface MessagePrintable{
       void msg();
     }
    }

abstract Class Example implements Printable.MessagePrintable
{
	public void print()
		{
			System.out.println("print");
	}

	public void msg()
		{
			System.out.println("msg");
	}
}

class Interface_Q14 extends Example
{
	public static void main(String[] arg)
	{
		example e=new defmeth();
		e.msg();
		e.print();

	}
}

