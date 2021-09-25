//Hierarchical Inheritance Example
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest

//creating parent class account
class Account
{
	long accno;
	float balance;
	void insertaccount(long accno,float balance)
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
	void deposit(float amount)
	{
		float interest=1000;
		balance=balance + amount + interest;
		System.out.println("Amount Deposited Successfully in your Saving Acoount");
	}
}

//creating inherited class current
class Current extends Account
{
	void deposit(float amount)
	{
		balance=balance + amount;
		System.out.println("Amount Deposited Successfully in your Current Acoount");
	}
}

class Hierarchical_Inh1
{
	public static void main(String arg[])
	{
		//creating a object of child class saving
		Saving s=new Saving();
		s.insertaccount(20211308336L,10000);
		s.deposit(1000);
		s.displayaccount();

		Current c=new Current();
		c.insertaccount(2011018601138612L,19999.5f);
		c.deposit(2000);
		c.displayaccount();
	}
}
