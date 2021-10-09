//Java BufferedWriter Class

//Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class.
//The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.

import java.io.*;  
public class BufferedWriter_Q1 {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to mkpits");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  
