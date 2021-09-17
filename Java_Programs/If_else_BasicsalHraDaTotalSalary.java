//12-wap to accept basicsalary and calculate hra,da and totalsalary.
//(hra=50% of basicsalary,da=40% of basicsalary if basicsalary >=10000)
//(hra=30% of basicsalary,da=20% of basicsalary if basicsalary >=5000)
//(hra=10% of basicsalary,da=05% of basicsalary if basicsalary < 5000)
import java.util.*;
class If_else_BasicsalHraDaTotalSalary
{
	public static void main(String arg[])
	{
		int bs;
		float hra=0,da=0,ts=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		bs=s.nextInt();
			if(bs>=10000)
			{
				hra = bs * 0.50f;
			    da = bs * 0.40f;
			}
			else if(bs>=5000 && bs<10000)
			{
				hra = bs * 0.30f;
			    da = bs * 0.20f;
			}
			else if(bs<5000)
			{
				hra = bs * 0.10f;
			    da = bs * 0.05f;
		    }
		    ts = bs + hra + da;
		    System.out.println("hra: "+ hra );
			System.out.println("da: "+ da );
			System.out.println("total salary: "+ ts);
	}
}