//Example of CharArrayWriter Class:

//In this example, we are writing a common data to 4 files a.txt, b.txt, c.txt and d.txt.

    //package com.mkpits;

    import java.io.CharArrayWriter;
    import java.io.FileWriter;
    public class CharArrayWriter_Q1 {
    public static void main(String args[])throws Exception{
              CharArrayWriter out=new CharArrayWriter();
              out.write("Welcome to mkpits");
              FileWriter f1=new FileWriter("f:\\iofiles2\\1_test.txt");
              FileWriter f2=new FileWriter("f:\\iofiles2\\2_test.txt");
              FileWriter f3=new FileWriter("f:\\iofiles2\\3_test.txt");
              FileWriter f4=new FileWriter("f:\\iofiles2\\4_test.txt");
              out.writeTo(f1);
              out.writeTo(f2);
              out.writeTo(f3);
              out.writeTo(f4);
              f1.close();
              f2.close();
              f3.close();
              f4.close();
              System.out.println("Success...");
             }
            }
