//create a class account having field accountno, bal and method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.

class account {
	int acctno;
	int bal=1000;
	void deposit(int amt) {
		System.out.println("deposit method of account class");
	}
	void withdrawl(int amt) {
		System.out.println("withdrawl method of account class");
	}
}
class saving extends account {

	void deposit(int amt) {
		bal=bal+amt;
		System.out.println("deposit method of saving class, balance is " + bal);
	}
	void withdrawl(int amt) {
		bal=bal-amt;
		System.out.println("withdrawl method of saving class , balance is " + bal);
	}
}

class Overriding_Q6 {

	public static void main(String[] args) {
		//account act=new account();
		//	act.acctno=123;
		//	act.deposit(100);
		//	act.withdrawl(50);
		saving s=new saving();
		s.acctno=123;
		s.deposit(100);
		s.withdrawl(50);
	}
}
