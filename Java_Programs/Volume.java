//4-wap to accept to length, breadth, height and then print volume
import java.util.*;
class Volume
{
	public static void main(String arg[])
	{
		int l,b,h,volume;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length: ");
		l=s.nextInt();
		System.out.println("Enter breadth: ");
		b=s.nextInt();
		System.out.println("Enter Height: ");
		h=s.nextInt();
		volume=l*b*h;
		System.out.println("Volume: "+volume);
	}
}
