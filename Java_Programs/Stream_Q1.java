//Java FileOutputStream
//Example 1: write byte

import java.io.*;
import java.util.*;
class Stream_Q1
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fs=new FileOutputStream("f:\\iofiles\\1_testout.txt");
			fs.write(65);
			fs.close();
			System.out.println("success...");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
