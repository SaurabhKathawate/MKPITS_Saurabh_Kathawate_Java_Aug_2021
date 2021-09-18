class Rectangle
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

class TestRectangle1
{
	public static void main(String arg[])
	{
		Rectangle r1=new Rectangle();
		r1.insert(8,5);
		r1.calculateArea();
	}
}