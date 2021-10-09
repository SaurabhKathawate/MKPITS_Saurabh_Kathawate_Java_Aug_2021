//Java FileOutputStream
//Example 2: write string

import java.io.*;
import java.util.*;
class Stream_Q2
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fs=new FileOutputStream("f:\\iofiles\\2_testout.txt");
			String str="Welcome to mkpits";
			byte arr[]=str.getBytes();   //converting string into byte array
			fs.write(arr);
			fs.close();
			System.out.println("success...");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}