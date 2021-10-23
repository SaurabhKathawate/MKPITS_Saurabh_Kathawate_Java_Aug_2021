//ExceptionHandling with MethodOverriding in Java

//1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

class account {
	void deposit(int amt) {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws IOException {
		System.out.println("deposit method of saving class");
	}
}

public class Exception_Handling_Q1{
        public static void main(String[] args)  {


    }
}
//error