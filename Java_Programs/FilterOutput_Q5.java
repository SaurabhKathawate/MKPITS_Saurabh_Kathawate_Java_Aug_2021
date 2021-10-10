import java.io.*;
    public class FilterOutput_Q5 {
        public static void main(String[] args) throws IOException {
            File data = new File("f:\\iofiles2\\9_test.txt");
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream filter = new FilterOutputStream(file);
            String s="Welcome to mkpits.";
            byte b[]=s.getBytes();
            filter.write(b);
            filter.flush();
            filter.close();
            file.close();
            System.out.println("Success...");
        }
    }
