//11-wap to accept 3 subject marks and then print total, percentage.
import java.util.*;
class Total_Percentage
{
	public static void main(String arg[])
	{
		int s1,s2,s3,total;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Marks of First Subject");
		s1=s.nextInt();
		System.out.println("Enter Marks of Second Subject");
		s2=s.nextInt();
		System.out.println("Enter Marks of Third Subject");
		s3=s.nextInt();
		total=s1+s2+s3;
		percentage=(float)((total/300.0f)*100);
	    System.out.println("Total Marks: "+ total);
	    System.out.println("Percentage: "+ percentage);
	}
}