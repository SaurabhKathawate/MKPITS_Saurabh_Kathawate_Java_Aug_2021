//5-wap to accept 2 no & multiplication of 2 no
import java.util.*;
class Basic_Multiplication
{
	public static void main(String arg[])
	{
		int n1,n2,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n1: ");
		n1=s.nextInt();
		System.out.println("Enter n2: ");
		n2=s.nextInt();
		result=n1*n2;
		System.out.println("Multiplication: "+result);
	}
}