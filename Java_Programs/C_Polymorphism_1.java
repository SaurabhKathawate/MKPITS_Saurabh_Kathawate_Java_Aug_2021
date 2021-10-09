//Example of runtime polymorphism using account, saving and current class

import java.util.*;
class Account
{
	long acno;
	double bal=1000;
	String deposit(long acno,double amt)
	{
		return "deposited";
	}
	String withdrawl(long acno,double amt)
	{
		if(amt>bal)
		{return "Insufficient Fund";}
		else
		{
			bal=bal-amt;
			return "withdrawl, Balance: "+bal;
		}
	}
}
class Saving extends Account
{
	String deposit(long acno,double amt)
	{
		double interest=100;
		this.acno=acno;
		bal=bal+amt+interest;
		return "deposited amount, balanc: "+bal;
	}
}
class Current extends Account
{
	String deposit(long acno,double amt)
	{
		this.acno=acno;
		bal=bal+amt;
		return "deposited amount, balanc: "+bal;
	}
}

class C_Polymorphism_1
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Account no");
		Long acno=scan.nextLong();
		System.out.println("saving/current");
		String actype=scan.next();
		System.out.println("deposit/withdrawl");
		String dw=scan.next();
		System.out.println("Enter Amount");
		double amt=scan.nextDouble();

		Account ac=null;
		String str;

		if(actype.equals("saving"))
		ac=new Saving();
		else if(actype.equals("current"))
		ac=new Current();
		else
		System.out.println("Invalid Account");

		if(dw.equals("deposit"))
		{
			str=ac.deposit(acno,amt);
			System.out.println(str);
		}
		else if(dw.equals("withdrawl"))
		{
			str=ac.withdrawl(acno,amt);
			System.out.println(str);
		}
	}
}