//create a class account having field accountno, bal and method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.

class Account{
	long accno;
	int bal=1000;
	void deposit(int amt){
		System.out.println("Deposited");
	}
	void withdrawl(int amt){
		System.out.println("Withdrawl");
	}
}

class Saving extends Account{
	void deposit(int amt){
		bal=bal+amt;
		System.out.println("Amount Deposited, Balance:"+bal);
	}
	void withdrawl(int amt){
		bal=bal-amt;
		System.out.println("Amount Withdrawl, Balance: "+bal);
	}
}

class Overriding_P5{
	public static void main(String arg[]){
		Saving s=new Saving();
		s.accno=123;
		s.deposit(100);
		s.withdrawl(50);
	}
}
