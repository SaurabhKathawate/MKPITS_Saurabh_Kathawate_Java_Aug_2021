//7-wap to accept a no. and print table of that no. using for loop.
import java.util.*;
class For_Table
{
	public static void main(String arg[])
	{
		int num,i=0,table=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		System.out.println("Table of "+num);
		for(i=1;i<=10;i++)
		{
			table=num*i;
			System.out.println(table);
		}
	}
}