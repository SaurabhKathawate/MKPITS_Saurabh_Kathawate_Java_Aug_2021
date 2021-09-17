//9-wap to accept 2 no. and display the smallest no.
import java.util.*;
class If_else_SmallNumber
{
	public static void main(String arg[])
	{
		int n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number n1: ");
		n1=s.nextInt();
		System.out.println("Enter Number n2: ");
		n2=s.nextInt();
		if(n1<n2)
		System.out.println("n1 is smallest");
		else
		System.out.println("n2 is smallest");
	}
}