//Java Interface Example: Drawable
    interface Shape
    {
		void draw1();
	}
	class Circle implements Shape
	{
		public void draw1()
		{
	System.out.println("circle coding");
		}
	}
	class Interface_Q4
	{

		public static void main(String[] arg)
		{

Circle c=new Circle();
c.draw1();
		}
	}
