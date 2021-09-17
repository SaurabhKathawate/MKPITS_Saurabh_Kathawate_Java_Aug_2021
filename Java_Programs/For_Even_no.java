//4-wap to print even no. between 1 to 10 using for loop
import java.util.*;
class For_Even_no
{
	public static void main(String arg[])
	{
		int i=0;
		System.out.println("Numbers are: ");
		for(i=1;i<=10;i++)
		{
			if(i % 2 == 0)
			System.out.println(i);
		}
	}
}