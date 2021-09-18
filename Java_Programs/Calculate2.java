//main inside another class
class Calculate2
{
	static int cube(int n)
	{
		return n*n*n;
	}
}
class Test
{
	public static void main(String arg[])
	{
		Calculate2 c1=new Calculate2();
		int result =Calculate2.cube(2); // provide class name and then static method name
		System.out.println("cube = " + result);
	}
}
