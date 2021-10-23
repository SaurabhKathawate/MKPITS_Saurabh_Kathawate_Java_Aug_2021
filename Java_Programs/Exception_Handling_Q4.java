import java.io.*;
class account {
	void deposit(int amt) throws IOException {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt)   {
		System.out.println("deposit method of saving class");
	}
}

public class Exception_Handling_Q4{
        public static void main(String[] args)  {
			try {
saving s=new saving();
s.deposit(100);
}
catch(Exception ee ) { }

    }
}
