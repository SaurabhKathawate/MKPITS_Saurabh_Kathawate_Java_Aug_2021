import java.util.*;
abstract class Account
{
	long actno;
	float bal=999.99f;
	abstract String deposit(long actno,float amt);
	//{
		//method without body     return ;
	//}
	String withdrawl(long actno,float amt)
	{
		if(amt>bal)
		{return "Insufficient Balance";}
		else
		{
			bal=bal-amt;
			return "Amount Withdrawl, Balance: "+bal;
		}
	}
}

class Saving extends Account
{
	float interest=99.99f;
	String deposit(long actno,float amt)
	{
		bal=bal+amt+interest;
		return "Amount Deposited, Balance: "+bal;
	}
}

class Current extends Account
{
	String deposit(long actno,float amt)
	{
		bal=bal+amt;
		return "Amount Deposited, Balance: "+bal;
	}
}

class Abstract_Q4
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Account Number");
		long actno=scan.nextLong();

		System.out.println("Enter Account type saving/current");
		String acttype=scan.next();

		System.out.println("Do you want to deposit/withdrawl");
		String ans=scan.next();

		System.out.println("Enter Amount");
		float amt=scan.nextFloat();

		Account act=null;   //creating reference variable of parent class account

		String str;

		if(acttype.equals("saving"))
		{act=new Saving();}
		else if(acttype.equals("current"))
		{act=new Current();}
		else
		{System.out.println("Invalic Account type");}

		if(ans.equals("deposit"))
		{
			str=act.deposit(actno,amt);
			System.out.println(str);
		}
		else if(ans.equals("withdrawl"))
		{
			str=act.withdrawl(actno,amt);
			System.out.println(str);
		}
	}
}
