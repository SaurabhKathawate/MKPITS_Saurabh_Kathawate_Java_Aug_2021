import java.io.*;  
public class Output_Q3{  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream(D:\\testout.txt);  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
