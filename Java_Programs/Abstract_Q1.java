//A class which is declared with the abstract keyword is known as an abstract class in Java.
//abstract class can have abstract methods (method without body) and non-abstract methods (method with the body).

abstract class Account
{
	abstract void deposit();
	//{
		//method without body
	//}
	void withdrawl()
	{
		// method with body
		System.out.println("withdrawl method");
	}
}
class Saving extends Account
{
	void deposit()
	{
		System.out.println("deposit method of saving class");
	}
}

class Abstract_Q1
{
	public static void main(String[] arg)
	{
		//Account act=new Account();// error since you cannot create instance of abstract class
		Account act=null;
		act=new Saving();
		act.deposit();
	}
}
