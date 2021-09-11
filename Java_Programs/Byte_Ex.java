import java.util.*;
class Byte_Ex
{
	public static void main(String arg[])
	{
		byte b1=123;
		System.out.println("byte value"+b1);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter byte no: ");
		b1=s.nextByte();
		System.out.println("byte value" +b1);
	}
}