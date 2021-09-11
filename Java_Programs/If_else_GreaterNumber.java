//1-wap to accept 2 no and print greater no
import java.util.*;
class If_else_GreaterNumber
{
	public static void main(String arg[])
	{
		int n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n1: ");
		n1=s.nextInt();
		System.out.println("Enter n2: ");
		n2=s.nextInt();
		if(n1>n2)
			System.out.println("n1 is greater");
		else
			System.out.println("n2 is greater");
	}
}