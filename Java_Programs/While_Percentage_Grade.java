//10-wap to accept 5 subject marks using while loop and print the sum of 5 subjects, calculate percentage and print grade
import java.util.*;
class While_Percentage_Grade
{
	public static void main(String arg[])
		{
			int i=1,marks,total=0;
			float per;
			char grade=0;
			while(i<=5)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter Marks: "+i);
			  	marks=s.nextInt();
			  	total=total+marks;
			  	i++;
			}
			System.out.println("Total Marks: "+total);
			per=(float)(total/5.0f);
			System.out.println("Percentage: "+per);
			if(per>=90)
			grade = 'A';
			else if(per>=75)
			grade = 'B';
			else if(per>=60)
			grade = 'C';
			else if(per>=50)
			grade = 'D';
			else if(per>=35)
			grade = 'E';
			else if(per<35)
			grade = 'F';
			System.out.println("Grade: "+grade);
		}
}