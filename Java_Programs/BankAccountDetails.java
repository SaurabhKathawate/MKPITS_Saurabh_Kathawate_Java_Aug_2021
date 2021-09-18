//Java Program by accepting values from the user to demonstrate the working of a banking-system where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods
import java.util.*;
class Account
{
	int acc_no;
	String name;
	int amount;
	//method to initialize object
	void insert(int a,String n,int amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	//deposit
	void deposit(int amt)
	{
		amount=amount+amt;
		System.out.println("Deposited Amount: "+amt);
	}
	//withdraw
	void withdraw(int amt)
	{
		if(amount<amt)
		{System.out.println("Insufficient Balance");}
		else
		{amount=amount-amt;
		System.out.println("Withdraw Amount: "+amt);}
	}
	//checkBalance
	void checkBalance()
	{
		System.out.println("Balance Amount: "+amount);
	}
	//display
	void display()
	{
		System.out.println("Account Number: "+acc_no);
		System.out.println("Customer Name: "+name);
		System.out.println("total Amount: "+amount);
	}
}

//Creating a BankAcoountDetails class to deposit and withdraw amount
class BankAccountDetails
{
	public static void main(String arg[])
	{
		Account a1=new Account();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int acc_no=s.nextInt();
		System.out.println("Enter Account Holder Name: ");
		String name=s.next();
		System.out.println("Enter Amount: ");
		int amount=s.nextInt();

		a1.insert(acc_no,name,amount);
		a1.display();
		System.out.println("enter Amount to be deposited in your account ");
		int amt=s.nextInt();
		a1.deposit(amt);
		a1.checkBalance();

		System.out.println("enter Amount to be withdrawl in your account ");
		amt=s.nextInt();      //error for int amt=s.nextInt();

		a1.withdraw(amt);
		a1.checkBalance();
	}
}




