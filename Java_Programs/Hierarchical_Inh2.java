//Hierarchical Inheritance Example
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest
//by acceptin values from the user

//creating parent class account
class Account
{
	long accno;
	int balance;
	void insertaccount(long accno,int balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	void displayaccount()
	{
		System.out.println("Balance for Account Number "+accno+" is "+balance);
	}
}

//creating inherited class saving
class Saving extends Account
{
	void deposit(int amount)
	{
		int interest=1000;
		balance=balance + amount + interest;
		System.out.println("Amount Deposited Successfully in your Saving Acoount");
	}
}

//creating inherited class current
class Current extends Account
{
	void deposit(int amount)
	{
		balance=balance + amount;
		System.out.println("Amount Deposited Successfully in your Current Acoount");
	}
}

class Hierarchical_Inh2
{
	public static void main(String arg[])
	{
		//creating a object of child class saving
		Saving s=new Saving();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("--------enter details for saving account--------");
		System.out.println("enter account no");
		int accno=scan.nextInt();
		System.out.println("enter balance");
		int balance=scan.nextInt();

		s.insertaccount(accno,balance);
		System.out.println("Enter Amount to Deposited: ");
		int amount=scan.nextInt();
		s.deposit(amount);
		s.displayaccount();

		//creating a object of child class current
		Current c=new Current();
		System.out.println("--------enter details for current account--------");
		System.out.println("enter account no");
		accno=scan.nextInt();
		System.out.println("enter balance");
		balance=scan.nextInt();

		c.insertaccount(accno,balance);
		System.out.println("Enter Amount to Deposited: ");
		amount=scan.nextInt();
		c.deposit(amount);
		c.displayaccount();
	}
}
