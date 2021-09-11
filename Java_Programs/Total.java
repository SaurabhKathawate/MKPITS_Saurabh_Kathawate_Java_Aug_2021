//5-wap to accept 3 subject marks and then print total marks.
import java.util.*;
class Total
{
	public static void main(String arg[])
	{
		int s1,s2,s3,total;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Marks of First Subject");
			s1=s.nextInt();
			System.out.println("Enter Marks of Second Subject");
			s2=s.nextInt();
			System.out.println("Enter Marks of Third Subject");
			s3=s.nextInt();
			total=s1+s2+s3;
	System.out.println("Total Marks"+ total);
	}
}