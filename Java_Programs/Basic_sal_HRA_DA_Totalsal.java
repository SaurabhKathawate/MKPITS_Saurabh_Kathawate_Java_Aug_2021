//wap to accept basic salary, hra, da to print total salary.
import java.util.*;
class Basic_sal_HRA_DA_Totalsal
{
	public static void main(String arg[])
	{
		float basic_salary,da,hra,da1,hra1,total_salary;

		  Scanner scan=new Scanner(System.in);

		  System.out.println("Enter Basic Salary Of Employee: ");
		  basic_salary=scan.nextFloat();

		  System.out.println("Enter DA Of Employee: ");
		  da1=scan.nextFloat();

		  System.out.println("Enter HRA Of Employee: ");
		  hra1=scan.nextFloat();

		  da = (da1 * basic_salary) / 100;
		  hra = (hra1 * basic_salary) / 100;

		  total_salary = basic_salary + da + hra;

  System.out.println("Total Salary Of Employee: "+ total_salary);
	}
}