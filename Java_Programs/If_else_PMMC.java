//7-wap to accept 2 no. and operator like +,-,*,/ and then display the result.
import java.util.*;
class If_else_PMMC
{
	public static void main(String arg [])
	{
		int n1,n2,result=0;
		char operator;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number n1: ");
		n1= s.nextInt();
		System.out.println("Enter number n2: ");
		n2= s.nextInt();
		System.out.println("Enter operator like (+,-,*,/): ");
		operator= s.next().charAt(0);
		if(operator=='+')
		result = n1+n2;
		else if(operator=='-')
		result = n1-n2;
		else if(operator=='*')
		result = n1*n2;
		else if(operator=='/')
		result = n1/n2;
		else
		System.out.println("Invalid operator");
		System.out.println("Result: "+result);
	}
}