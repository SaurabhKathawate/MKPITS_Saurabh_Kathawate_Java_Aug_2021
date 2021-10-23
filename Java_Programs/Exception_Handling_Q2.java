//2) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.

class account {
	void deposit(int amt) {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws ArithmeticException {
		System.out.println("deposit method of saving class");
	}
}

public class Exception_Handling_Q2 {
        public static void main(String[] args)  {
saving s=new saving();
s.deposit(100);

    }
}
