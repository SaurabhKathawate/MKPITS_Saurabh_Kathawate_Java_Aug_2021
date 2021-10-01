//Note: An interface can have another interface which is known as a nested interface. We will learn it in detail in the nested classes chapter. For example:

    interface Printable{  
     void print();  
     interface MessagePrintable{  
       void msg();  
     }  
    }  
    interface Printable{
     void print();
     interface MessagePrintable{
       void msg();
     }
    }

class example implements printable.MessagePrintable
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
class Interface_Q12
{
	public static void main(String[] arg)
	{
		example e=new example();
		e.msg();
		e.print();
	}
}
