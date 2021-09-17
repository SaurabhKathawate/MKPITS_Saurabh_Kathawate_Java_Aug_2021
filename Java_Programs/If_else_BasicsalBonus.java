//6-wap to accept basicsalary and then calculate bonus (bonus =1000 if salary > 10000, bonus=500 if salary > 5000 or bonus=100)
import java.util.*;
class If_else_BasicsalBonus
{
	public static void main(String arg[])
	{
		int basicsal,bonus=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Bsic Salary: ");
		basicsal=s.nextInt();
		if(basicsal>=10000)
		bonus=1000;
		else if(basicsal>=5000)
		bonus=500;
		else
		bonus=100;
		System.out.println("Bonus: "+bonus);
	}
}