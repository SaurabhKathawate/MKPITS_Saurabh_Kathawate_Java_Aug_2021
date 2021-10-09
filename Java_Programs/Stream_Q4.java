//Java FileInputStream
//Example 1: read single character

import java.io.*;
import java.util.*;
class Stream_Q4
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fs=new FileInputStream("f:\\iofiles\\4_testin.txt");
			int i=fs.read();
			//System.out.print(i);
			System.out.println((char)i);
			fs.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
