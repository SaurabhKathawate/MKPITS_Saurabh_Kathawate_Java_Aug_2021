class Calculation
{
	void factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial: "+fact);
	}
}

class Factorial
{
	public static void main(String arg[])
	{
		//with reference variable
		Calculation c1=new Calculation();
		c1.factorial(5);
		//with anonyamous
		new Calculation().factorial(6);
	}
}