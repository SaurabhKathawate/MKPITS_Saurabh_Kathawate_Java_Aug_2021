//Example of java PrintStream class

//In this example, we are simply printing integer and string value.

    //package com.mkpits;

    import java.io.FileOutputStream;
    import java.io.PrintStream;
    public class PrintStream_Q2{
     public static void main(String args[])throws Exception{
       FileOutputStream fout=new FileOutputStream("f:\\iofiles2\\5_test.txt");
       PrintStream pout=new PrintStream(fout);
       pout.println(2021);
       pout.println("Hello Java");
       pout.println("Welcome to Java");
       pout.close();
       fout.close();
      System.out.println("Success...");
     }
    }
