interface Printable
{
    int MIN=5;
    void print();
}
public class Interface_Q2 implements Printable
{
    public void print()
    {
		System.out.println("min " + MIN);
    }

    public static void main(String[] args)
    {
		Printable p=new Interface_Q2();
		p.print();
    }
}
