//9-wap to accept 5 subject marks using for loop & print total, percentage and display grade using if else if statement.
import java.util.*;
class For_Marksheet
{
	public static void main(String arg[])
	{
		int marks,total=0,i;
		float per;
		char grade='I';
		for(i=1;i<=5;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter marks: ");
			marks=s.nextInt();
			total = total + marks;
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