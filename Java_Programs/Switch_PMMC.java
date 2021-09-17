//3-wap to accept 2 no and operator like +,-,*,/ and then print the result using switch statement.
import java.util.*;
class Switch_PMMC
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
		switch(operator)
		{
			case '+':
			result = n1+n2;
			break;
			case '-':
			result = n1-n2;
			break;
			case '*':
			result = n1*n2;
			break;
			case '/':
			result = n1/n2;
			break;
			default:
			System.out.println("Invalid Operator");
			break;
	    }
	    System.out.println("Result: " + result);
	}
}