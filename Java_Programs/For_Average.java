//10-wap to accept age of 5 students using for loop and then display the average age.
import java.util.*;
class For_Average
{
	public static void main(String arg[])
	{
		int i=1;
		float age=0,total=0,average;
		for(i=1;i<=5;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter age: ");
			age=s.nextInt();
			total=total+age;
		}
		average=(float)total/5.0f;
		System.out.println("Average age: "+average);
	}
}