//Java FileInputStream
//Example 2: read all characters

import java.io.*;
import java.util.*;
class Stream_Q5
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fs=new FileInputStream("f:\\iofiles\\5_testin.txt");
			int i=0;
			while((i=fs.read()) != -1)
			System.out.print((char)i);// to print in next line remove "ln"
			fs.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}