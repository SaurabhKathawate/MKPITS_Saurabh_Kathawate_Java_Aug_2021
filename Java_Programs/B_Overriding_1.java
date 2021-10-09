//create a parent class account having field accountno, bal and method deposit and withdrawl.
//create a subclass saving inherited from account class and override the deposit (with interest) and withdrawl method.
//create a subclass current inherited from account class and override the deposit (without interest) and withdrawl method.

import java.util.*;
class Account
{
	long acno;
	double bal=999.99;
	String deposit(long acno,double amt)
	{
		return "Deposited";
	}
	String withdrawl(long acno,double amt)
	{
		this.acno=acno;
		if(amt>bal)
		{return "Insufficient Fund";}
		else
		{bal=bal-amt;
		return "Amount withdrawl, Balance is: "+bal;}
	}
}
class Saving extends Account
{
	double interest=99.99;
	String deposit(long acno,double amt)
	{
		this.acno=acno;
		//double interest=99.99;
		bal=bal+amt+interest;
		return "Amount deposited, Balance is: "+bal;
	}
}
class Current extends Account
{
	String deposit(long acno,double amt)
	{
		this.acno=acno;
		bal=bal+amt;
		return "Amount deposited, Balance is: "+bal;
	}
}

class B_Overriding_1
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account no");
		long acno=scan.nextLong();

		System.out.println("Account type saving/current");
		String actype=scan.next();

		System.out.println("select deposit/withdrawl");
		String dw=scan.next();

		System.out.println("Enter Amount");
		double amt=scan.nextDouble();

		//Account a=new Account();
		Saving sav=null;
		Current cur=null;
		String str;

		if(actype.equals("saving"))
		{
			sav=new Saving();
			if(dw.equals("deposit"))
			{
				str=sav.deposit(acno,amt);
				System.out.println(str);
			}
			else if(dw.equals("withdrawl"))
			{
				str=sav.withdrawl(acno,amt);
				System.out.println(str);
			}
		}
		if(actype.equals("current"))
		{
			cur=new Current();
			if(dw.equals("deposit"))
			{
				str=cur.deposit(acno,amt);
				System.out.println(str);
			}
			else if(dw.equals("withdrawl"))
			{
				str=cur.withdrawl(acno,amt);
				System.out.println(str);
			}
		}
	}
}