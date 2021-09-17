//5-wap to accept basic salary,designation and calculate bonus 1000 for m, 500 for c, 100 for p and total.
import java.util.*;
class Switch_SalaryDesignationBonusTotal
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

		switch(designation)
		{
			case 'm' :
			bonus=1000;
			break;
			case 'c' :
			bonus=500;;
			break;
			case 'p' :
			bonus=100;
			break;
			default :
			System.out.println("Invalid Designation");
			break;
		}
		System.out.println("Bonus: "+bonus);
		total=basicsal+bonus;
		System.out.println("Total Salary: "+total);
	}
}