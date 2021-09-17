//8-wap to accept basicsalary and designation like 'm' for manager ,'c' for clerk and 'p' for peon
//and then calculate bonus=1000 for 'm', 500 for 'c', 100 for 'p'and display basicsalary,bonus & totalsalary
import java.util.*;
class If_else_SalaryDesignationBonusTotal
{
	public static void main(String arg[])
	{
		int basicsal,bonus=0,total;
		char designation;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		basicsal=s.nextInt();
		System.out.println("Enter operator like (m,c,p): ");
		designation= s.next().charAt(0);

		if(designation == 'm')
		bonus=1000;
		else if(designation == 'c')
		bonus=500;
		else
		bonus=100;

        total=basicsal+bonus;
		System.out.println("Basic Salary: "+basicsal);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+total);
	}
}