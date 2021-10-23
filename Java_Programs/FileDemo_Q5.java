//Java File Class Example

    import java.io.*;  
    public class FileDemo_Q5 {  
        public static void main(String[] args) {  
      
            try {  
                File file = new File("javaFile123.txt");  
                if (file.createNewFile()) {  
                    System.out.println("New File is created!");  
                } else {  
                    System.out.println("File already exists.");  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
      
        }  
    }  
