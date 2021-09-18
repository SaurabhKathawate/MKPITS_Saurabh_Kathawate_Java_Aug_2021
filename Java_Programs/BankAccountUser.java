//Java Program by accepting values from the user to demonstrate the working of a banking-system where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods
import java.util.*;
class Account {
 int acct_no; //since i am not providing access modifier so it is default modifier
String name;
int amount;

void insert(int a,String n,int am) {
	acct_no=a;
	name=n;
	amount=am;
}

void deposit(int amt) {
	amount = amount +amt;
	System.out.println( amt + " deposited successfully ");
}

void withdrawl(int amt ) {
							if(amount < amt ) {
							System.out.println("cannot withdrawl amount due to insufficient fund " );
							}
							else {
							amount=amount -amt;
							System.out.println("Rs. " + amt + " withdrawl successfully");
							}
}

	void checkBalance() {
		System.out.println(" Balance amount is " + amount);
	}

	void display()
	{
		System.out.println(" Acct No : " + acct_no );
		System.out.println(" Name  : " + name );
		System.out.println(" Amount : " + amount );
	}

}

class BankAccountUser{
     public static void main(String args[]){

Account a1=new Account();
Scanner scan=new Scanner(System.in);
System.out.println("enter account number ");
int acct_no=scan.nextInt();
System.out.println("enter Account Holder name ");
String name=scan.next();
System.out.println("enter Amount ");
int  amount=scan.nextInt();

a1.insert(acct_no,name,amount);
a1.display();
System.out.println("enter Amount to be deposited in your account ");
int amt =scan.nextInt();
a1.deposit(amt);
a1.checkBalance();

System.out.println("enter Amount to be withdrawl in your account ");
 amt =scan.nextInt();

a1.withdrawl(amt);
a1.checkBalance();


    }
    }
