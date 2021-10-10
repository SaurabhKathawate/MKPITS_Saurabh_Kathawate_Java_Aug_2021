//Java ByteArrayOutputStream Class

//Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream, the data is written into a byte array which can be written to multiple streams later.

//The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.

import java.io.*;
public class DataStream_Q1 {
public static void main(String args[])throws Exception{
      FileOutputStream fout1=new FileOutputStream("f:\\iofiles2\\7_test.txt");
      FileOutputStream fout2=new FileOutputStream("f:\\iofiles2\\8_test.txt");

      ByteArrayOutputStream bout=new ByteArrayOutputStream();
      bout.write(65);
      bout.writeTo(fout1);
      bout.writeTo(fout2);

      bout.flush();
      bout.close();//has no effect
      System.out.println("Success...");
     }
    }

