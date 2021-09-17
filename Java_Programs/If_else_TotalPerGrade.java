//5-wap to accept 3 subject marks and calculate total, percentage and grade
import java.util.*;
class If_else_TotalPerGrade
{
	public static void main(String arg[])
	{
		int s1,s2,s3,total;
		float per;
		char grade='I';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Marks of Subject s1: ");
		s1=s.nextInt();
		System.out.println("Enter Marks of Subject s2: ");
		s2=s.nextInt();
		System.out.println("Enter Marks of Subject s3: ");
		s3=s.nextInt();
		total=s1+s2+s3;
		per=(float)(total/3.0f);
		//grade=s.next().charAt(0);
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
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+per);
		System.out.println("Grade: "+grade);
	}
}