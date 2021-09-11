//12-wap to accept empno, empname and salary and then print hra ,da, and total salary.
import java.util.*;
class Total_Salary
{
	public static void main(String arg[])
	{
		int empno,salary;
		float hra,da,total_salary;
		String empname;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Number");
		empno=s.nextInt();
		System.out.println("Enter Salary");
		salary=s.nextInt();
		System.out.println("Enter Employee Name");
		empname=s.next();
		hra=(float)(salary * 0.20f);
		da=(float)(salary * 0.10f);
		total_salary=hra+da+salary;
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
	    System.out.println("Total Salary: " + total_salary);
	}
}
