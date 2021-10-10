    import java.io.*;
    public class FilterInput_Q6 {
        public static void main(String[] args) throws IOException {
            File data = new File("f:\\iofiles2\\9_test.txt");
            FileInputStream  file = new FileInputStream(data);
            FilterInputStream filter = new BufferedInputStream(file);
            int k =0;
            while((k=filter.read())!=-1){
                System.out.print((char)k);
            }
            file.close();
            filter.close();
        }
    }
