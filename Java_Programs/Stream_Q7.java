//Example of BufferedInputStream class

import java.io.*;
import java.util.*;
class Stream_Q7
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("f:\\iofiles\\7_testin.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			while((i=bin.read()) !=-1)
			{System.out.print((char)i);
        }
			bin.close();
			fin.close();
	}
	catch(Exception e)
	{System.out.println(e);}
	}
}

