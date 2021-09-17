//7-wap to accept a no. and print the table of that no
import java.util.*;
class While_Table
{
	public static void main(String arg[])
	{
		int num,i=1,table;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		System.out.println("Table of "+num);
		while(i<=10)
		{
			table=num*i;
			i++;
			System.out.println(table);
		}
	}
}