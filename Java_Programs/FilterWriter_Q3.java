//Java FilterWriter

//Java FilterWriter class is an abstract class which is used to write filtered character streams.

//The sub class of the FilterWriter should override some of its methods and it may provide additional methods and fields also.

    import java.io.*;  
    class CustomFilterWriter extends FilterWriter {  
        CustomFilterWriter(Writer out) {  
            super(out);  
        }  
        public void write(String str) throws IOException {  
            super.write(str.toLowerCase());  
        }  
    }  
    public class FilterWriter_Q3 {  
        public static void main(String[] args) {  
            try {  
                FileWriter fw = new FileWriter("Record.txt");   
                CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
                filterWriter.write("I LOVE MY COUNTRY");  
                filterWriter.close();  
                FileReader fr = new FileReader("record.txt");  
                BufferedReader bufferedReader = new BufferedReader(fr);  
                int k;  
                while ((k = bufferedReader.read()) != -1) {  
                    System.out.print((char) k);  
                }  
                bufferedReader.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
