//3- wap to accept age and print whether he is minor, young or old
import java.util.*;
class If_else_MinorYoungOld
{
	public static void main(String arg[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=s.nextInt();
		if(age<18)
		System.out.println("you are minor");
		else if(age>=18 && age<=45)
		System.out.println("you are young");
		else if(age>45)
		System.out.println("you are old");
	}
}