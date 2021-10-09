//Java SequenceInputStream Example
//In this example, we are printing the data of two files testin.txt and testout.txt.

    import java.io.*;
    class Stream_Q8 {
      public static void main(String args[])throws Exception{
       FileInputStream input1=new FileInputStream("f:\\iofiles\\7_testin.txt");
       FileInputStream input2=new FileInputStream("f:\\iofiles\\5_testin.txt");
       SequenceInputStream inst=new SequenceInputStream(input1, input2);
       int j;
       while((j=inst.read())!=-1){
        System.out.print((char)j);
       }
       inst.close();
       input1.close();
       input2.close();
      }
    }
