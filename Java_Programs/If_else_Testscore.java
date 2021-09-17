//4-wap to print grade
import java.util.*;
class If_else_Testscore
{
	public static void main(String arg[])
	{
		int testscore;
		char grade='I';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter testscore: ");
		testscore=s.nextInt();
		//grade=s.next().charAt(0);
		if(testscore>=90)
		grade = 'A';
		else if(testscore>=75)
		grade = 'B';
		else if(testscore>=60)
		grade = 'C';
		else if(testscore>=50)
		grade = 'D';
		else if(testscore>=35)
		grade = 'E';
		else if(testscore<35)
		grade = 'F';
		else
		System.out.println("Invalid testscore");
		System.out.println("Grade: "+ grade);
	}
}