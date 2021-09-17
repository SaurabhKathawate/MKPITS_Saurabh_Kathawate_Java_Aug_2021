//3-wap to print no. from 10 to 5 using do while loop
import java.util.*;
class Do_While_10to5
{
	public static void main(String arg[])
	{
		int num=10;
		System.out.println("Numbers are: ");
		do
		{
			System.out.println(num);
			num--;
		}
		while(num>=5);
	}
}