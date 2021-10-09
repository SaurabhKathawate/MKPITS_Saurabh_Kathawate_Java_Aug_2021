//Java SequenceInputStream Example
//In this example, we are writing the data of two files testin1.txt and testin2.txt into another file named testout.txt.

    import java.io.*;
    class Stream_Q9{
      public static void main(String args[])throws Exception{
       FileInputStream fin1=new FileInputStream("f:\\iofiles\\4_testin.txt");
       FileInputStream fin2=new FileInputStream("f:\\iofiles\\5_testin.txt");
       FileOutputStream fout=new FileOutputStream("f:\\iofiles\\9_testout.txt");
       SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
       int i;
       while((i=sis.read())!=-1)
       {
         fout.write(i);
       }
       sis.close();
       fout.close();
       fin1.close();
       fin2.close();
       System.out.println("Success..");
      }
    }
