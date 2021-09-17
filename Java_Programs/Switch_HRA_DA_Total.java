//6-wap to accept basicsal and designation and calculate hra 12% of basic for m, hra=8% for c, hra =5% for p and total.
import java.util.*;
class Switch_HRA_DA_Total
{
	public static void main(String arg[])
	{
		int basicsal;
		float hra=0,total=0;
		char designation;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		basicsal=s.nextInt();
		System.out.println("Enter Designation (m,c,p): ");
		designation=s.next().charAt(0);
		//total=basicsal + hra;
		switch(designation)
		{
			case 'm':
			hra=basicsal * 0.12f;
			break;
			case 'c':
			hra=basicsal * 0.08f;
			break;
			case 'p':
			hra=basicsal * 0.05f;
			break;
			default :
			System.out.println("Invalid Designation");
		}
		System.out.println("HRA: "+hra);
		total=basicsal + hra;

		System.out.println("Total Salary: "+total);
	}
}