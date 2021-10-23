//If the superclass method declares an exception

//1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

import java.io.*;
class account {
	void deposit(int amt) throws IOException {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws IOException  {
		System.out.println("deposit method of saving class");
	}
}

public class Exception_Handling_Q3{
        public static void main(String[] args)  {
			try {
saving s=new saving();
s.deposit(100);
}
catch(Exception ee ) { }

    }
}
