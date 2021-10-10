import java.io.*;
public class DataStream_Q4{
  public static void main(String[] args) throws IOException {
    InputStream input = new FileInputStream("f:\\iofiles2\\6_test.txt");
    DataInputStream inst = new DataInputStream(input);
    int count = input.available();
    byte[] ary = new byte[count];
    inst.read(ary);
    for (byte bt : ary) {
      char k = (char) bt;
      System.out.print(k+"-");
    }
  }
}
