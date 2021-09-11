//3-wap to accept length and breadht of rectangle and then print area of rectangle.
import java.util.*;
class Area
{
	public static void main(String arg[])
	{
		int l,b,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length: ");
		l=s.nextInt();
		System.out.println("Enter Breadth: ");
		b=s.nextInt();
		area=l*b;
		System.out.println("Area of Rectangle: "+ area);

	}
}