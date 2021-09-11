//10-wap to accept rno, name and address and then display it.
import java.util.*;
class String_Ex
{
	public static void main(String arg[])
	{
		int rno;
		String name;
		String address;
		Scanner s=new Scanner(System.in);
		System.out.println("enter rno. ");
		rno=s.nextInt();
		System.out.println("enter name. ");
		name=s.next();
		System.out.println("enter address. ");
		address=s.next();

		System.out.println("rno : " + rno);
		System.out.println("name : " + name);
		System.out.println("address : " + address);
	}
}
