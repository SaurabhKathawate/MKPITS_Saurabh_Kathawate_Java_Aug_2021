interface Shape
{
	void draw();
}

class Circle implements Shape
{
	public void draw( )
	{
		System.out.println("code to draw circle");
	}
}

class Rectangle implements Shape
{
	public void draw( )
	{
		System.out.println("code to draw rectangle");
	}
}

class Interface_Q1
{
	public static void main(String[] arg)
	{
		Shape s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}
