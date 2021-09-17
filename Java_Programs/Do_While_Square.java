//4-wap to accept a number and print square of that number program should ask the user "do you want to continue or not,
//if user press'y' and then it should ask for another number and if user presses 'n' the program should end.
import java.util.*;
class Do_While_Square
{
	public static void main(String arg[])
	{
		int num,square;
		char ans=0;
		do
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Number: ");
			num=s.nextInt();
			square=num*num;
			System.out.println("Square: "+square);
			System.out.println("Do you want to continue if yes press y otherwise n: ");
			ans=s.next().charAt(0);
		}
		while(ans=='y');
	}
}