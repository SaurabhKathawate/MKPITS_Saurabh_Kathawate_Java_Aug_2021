//Example of BufferedOutputStream class

import java.io.*;
import java.util.*;
class Stream_Q6
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("f:\\iofiles\\6_testout.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String str="Welcome to mkpits";
			byte arr[]=str.getBytes();
			bos.write(arr);
			bos.flush();
			bos.close();
			fos.close();
			System.out.print("success...");
			fos.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}