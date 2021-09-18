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

class Factorial_Multiple_Objects
{
	public static void main(String arg[])
	{
		//with reference variable
		Calculation c1=new Calculation(),c2=new Calculation(),c3=new Calculation();
		c1.factorial(5);
		c2.factorial(6);
		c3.factorial(7);
	}
}