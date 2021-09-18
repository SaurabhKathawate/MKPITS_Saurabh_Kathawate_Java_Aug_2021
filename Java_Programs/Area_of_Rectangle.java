class Area
{
	int length;
	int breath;
	void insert(int l, int b)
	{
		length=l;
		breath=b;
	}
	void calculateArea()
	{
		System.out.println(length*breath);
	}
}

class Area_of_Rectangle
{
	public static void main(String arg[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		r1.insert(10,6);
		r2.insert(12,8);
		r3.insert(14,10);
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
	}
}