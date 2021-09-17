//4-wap to accept designation like m,c,p and display the full designation.
import java.util.*;
class Switch_Designation
{
	public static void main(String arg[])
	{
		char designation;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter operator like (m,c,p): ");
		designation= s.next().charAt(0);
		switch(designation)
		{
			case 'm' :
			System.out.println("Manager");
			break;
			case 'c' :
			System.out.println("Clerk");
			break;
			case 'p' :
			System.out.println("Peon");
			break;
			default :
			System.out.println("Invalid Operator");
			break;
		}
	}
}