//10-wap to accept 3 no. and print the smallest no
import java.util.*;
class If_else_SmallestNumber
{
	public static void main(String arg[])
	{
		int n1,n2,n3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number n1: ");
		n1=s.nextInt();
		System.out.println("Enter Number n2: ");
		n2=s.nextInt();
		System.out.println("Enter Number n3: ");
		n3=s.nextInt();
		if(n1<n2 && n1<n3)
		System.out.println("n1 is smallest");
		else if(n2<n3)
		System.out.println("n2 is smallest");
		else
		System.out.println("n3 is smallest");
	}
}