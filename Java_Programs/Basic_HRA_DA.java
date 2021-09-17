//11-wap to accept basic salary, 25% hra, 35% da and total salary
import java.util.*;
class Basic_HRA_DA
{
	public static void main(String arg[])
	{
		int basicsal;
		float hra,da,totalsal;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		basicsal=s.nextInt();
		hra=0.25f * basicsal;
		da=0.35f * basicsal;
		totalsal=basicsal+hra+da;
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("Total Salary: "+totalsal);
	}
}