//Java FileOutputStream
//wap to accept your name and write this name in a file

import java.io.*;
import java.util.*;
class Stream_Q3
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fs=new FileOutputStream("f:\\iofiles\\3_testout.txt");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name");
			String str="Name: ";
			str +=scan.nextLine();
			byte arr[]=str.getBytes();
			fs.write(arr);
			fs.close();
			System.out.println("success...");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}