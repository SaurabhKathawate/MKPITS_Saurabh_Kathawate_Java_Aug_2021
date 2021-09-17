//8-wap to accept a number and print from 1 to the number entered by the user
import java.util.*;
class While_Print_no_User
{
	public static void main(String arg[])
	{
		int num,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		System.out.println("Numbers from 1 to "+num);
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
	}
}