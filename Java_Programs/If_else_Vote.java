//2-wap to accept 2 no and print greater no
import java.util.*;
class If_else_Vote
{
	public static void main(String arg[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age: ");
		age=s.nextInt();
		if(age>18)
			System.out.println("you are elegible to vote");
		else
			System.out.println("you are not elegible to vote");
	}
}