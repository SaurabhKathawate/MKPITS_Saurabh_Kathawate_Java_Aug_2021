//13-wap to accept basicsalary and designation like 'm' for manager,'c' for clerk and 'p' for peon.
//and then calculate bonus=50% of basicsalary for 'm', bonus=40% of basicsalary for 'c', bonus=30% of basic salary  for 'p'
//and display basicsalary,bonus and totalsalary.
import java.util.*;
class If_else_BasicsalDesgBonusTotalsal
{
	public static void main(String arg[])
	{
		int bs;
		float bonus=0,ts=0;
		char desg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		bs=s.nextInt();
		System.out.println("Enter Designation (m,c,p): ");
		desg=s.next().charAt(0);
		if(desg=='m')
		bonus= bs * 0.50f;
		else if(desg=='c')
		bonus= bs * 0.40f;
		else if(desg=='p')
		bonus= bs * 0.30f;
		else
		System.out.println("Invalid Designation");
		System.out.println("Basic Salary: "+bs);
		System.out.println("Bonus: "+bonus);
		ts=bs + bonus;
		System.out.println("Total Salary: "+ts);
	}
}