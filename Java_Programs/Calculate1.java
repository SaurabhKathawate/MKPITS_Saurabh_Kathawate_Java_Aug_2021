//Java Program to get the cube of a given number using the static method
//Another example of a static method that performs a normal calculation

class Calculate1
{
    static int cube(int n)
    {
      	return n*n*n;
    }

    public static void main(String args[])
    {
    	int result=Calculate1.cube(5);
    	System.out.println(result);
    }
}
