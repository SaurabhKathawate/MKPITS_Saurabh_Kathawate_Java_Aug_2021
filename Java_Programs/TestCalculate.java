//create a write-only class Book having setter methods
class Calculate
{
	private float roi;

	public void setRoi(float roi)
	{this.roi=roi;}

	public float calinterest(float p,int t)
	{
		float si=(p*roi*t)/100;
		return si;
	}
}

class TestCalculate
{
	public static void main(String[] arg)
	{
		Calculate c=new Calculate();
		c.setRoi(10);
		float si=c.calinterest(1000,1);
		System.out.println("Simple Interest: "+si);
	}
}