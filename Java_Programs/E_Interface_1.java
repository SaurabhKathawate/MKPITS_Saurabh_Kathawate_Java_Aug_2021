//Let's see another example of java interface which provides the implementation of Bank interface.

interface Bank
{
	float roi();
}
class SBI implements Bank
{
	public float roi()
	{return 7.5f;}
}
class PNB implements Bank
{
	public float roi()
	{return 8.5f;}
}

class E_Interface_1
{
	public static void main(String arg[])
	{
		Bank b1=new SBI();
		System.out.println("ROI of SBI: "+b1.roi());
		Bank b2=new PNB();
		System.out.println("ROI of PNB: "+b2.roi());
	}
}