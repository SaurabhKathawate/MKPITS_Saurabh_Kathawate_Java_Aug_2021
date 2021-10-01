//A real example of Java Method Overriding

//Consider a scenario where Bank is a class that provides functionality to get the rate of interest, However, the rate of interest varies according to banks.
//For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.

//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.

//Creating a parent class
class bank{
	int roi(){return 0;}
}

//creating child classes
class sbi extends bank{
	int roi(){return 8;}
}
class icici extends bank{
	int roi(){return 7;}
}
class axis extends bank{
	int roi(){return 9;}
}

class Overriding_P4{
	public static void main(String arg[]){
		//creating object
		sbi s=new sbi();
		icici i=new icici();
		axis a=new axis();
		System.out.println("SBI Rate of Interest: "+s.roi());
		System.out.println("ICICI Rate of Interest: "+i.roi());
		System.out.println("AXIS Rate of Interest: "+a.roi());
	}
}