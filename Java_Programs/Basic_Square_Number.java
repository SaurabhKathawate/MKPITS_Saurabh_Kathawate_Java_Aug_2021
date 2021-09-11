//4-wap to accept a number and print square of that number
import java.util.*;
class Basic_Square_Number
{
	public static void main(String arg[])
	{
		int num,square;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=s.nextInt();
		square=num*num;
		System.out.println("Square: "+square);
	}
}

