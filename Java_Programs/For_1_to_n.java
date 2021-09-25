//12-wap to print no. from 1 to 'n' entered by user using for loop
import java.util.*;
public class For_1_to_n
{
	public static void main(String arg[])
	{
		//loop counter initialisation
		int i=1;

		//create object of scanner class
		Scanner s=new Scanner(System.in);

		//enter the value of " n "
		System.out.print("Enter the value n : ");

		//read the value.
		int n=s.nextInt();

		System.out.println("Numbers are : ");

		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}