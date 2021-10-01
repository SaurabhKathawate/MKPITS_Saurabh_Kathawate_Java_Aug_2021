//create a class account having field accountno, bal and method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.

class Account{
	int accno;
	int bal=1000;
	String deposit(int accno,int amt){
		return "Deposited";
	}
	String withdrawl(int accno,int amt){
		return "Withdrawl";
	}
}

class Saving extends Account{
	int interest=100;
	String deposit(int accno,int amt){
		this.accno=accno;
		bal=bal+amt+interest;
		return "Amount Deposited, Balance:"+bal;
	}
	String withdrawl(int accno,int amt){
		this.accno=accno;
		if(amt>bal)
		{return "Insufficient Balance";}
		else
		{bal=bal-amt;
		return "Amount Withdrawl, Balance: "+bal;
		}
	}
}

class Overloading_P6{
	public static void main(String arg[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accno=scan.nextInt();
		System.out.println("enter amount");
		int amt=scan.nextInt();
		System.out.println("do you want to deposit or withdrawl");
        String ans=scan.next();

		Saving acc=new Saving();
		String str;
		if(ans.equals("deposit")) {
			str = acc.deposit(accno,amt);
			System.out.println(str);
			}
		else if(ans.equals("withdrawl")){
			str = acc.withdrawl(accno,amt);
			System.out.println(str);
        }
	}
}
