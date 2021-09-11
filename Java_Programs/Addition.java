//2-wap to accept 2 no. and then print addition of 2 no.
import java.util.*;
class Addition
{
	public static void main(String arg[])
	{
		int num1, num2, addition;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1=s.nextInt();
		System.out.println("Enter Second Number: ");
        num2=s.nextInt();
	    addition=num1 + num2;
		System.out.println("Addition of 2 Numbers: " + addition);
	}
}


