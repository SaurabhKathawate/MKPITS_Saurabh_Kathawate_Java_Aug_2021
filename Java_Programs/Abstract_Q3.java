import java.util.*;
abstract class Account
{
	int actno;
    int bal=1000;
	abstract String deposit(int actno,int amt);
	//{
	//     return "account class deposit method";
	//}
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if(amt > bal)
        {
            return  "Insufficient fund ";
        }
        else
        {
            bal = bal - amt;
            return "Amount withdrawl for acct no " + actno + ", bal is " + bal;
        }
    }
}
class Saving extends Account
{
    int interest=500;
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt+interest;
        return "Amount deposited for acct no " + actno + ", bal is " + bal;
    }
}

class Current extends Account
{
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt;
        return "Amount deposited for acct no " + actno + ", bal is " + bal;
    }
}

class Abstract_Q3
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int actno = scan.nextInt();

		System.out.println("Enter Amount: ");
		int amt = scan.nextInt();

		System.out.println("Enter Account type saving/current: ");
		String acttype = scan.next();

		System.out.println("Do you want to deposit or withdrawl");
		String ans = scan.next();

		Account act=null;; // creating reference variable of parent class account

		String str;

		if(acttype.equals("saving"))
		{act=new Saving();}
		else if(acttype.equals("current"))
		{act=new Current();}
		else
		{System.out.println("invalid account type");}

		if(ans.equals("deposit"))
		{
			str=act.deposit(actno,amt);
			System.out.println(str);
		}
		else if(ans.equals("withdrawl"));
		{
			str=act.withdrawl(actno,amt);
			System.out.println(str);
		}
	}
}