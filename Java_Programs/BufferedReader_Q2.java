//Java BufferedReader Class

//Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method.
//It makes the performance fast. It inherits Reader class.

    package com.javatpoint;  
    import java.io.*;  
    public class BufferedReader_Q2{  
        public static void main(String args[])throws Exception{    
              FileReader fr=new FileReader("D:\\testout.txt");    
              BufferedReader br=new BufferedReader(fr);    
      
              int i;    
              while((i=br.read())!=-1){  
              System.out.print((char)i);  
              }  
              br.close();    
              fr.close();    
        }    
    }    
