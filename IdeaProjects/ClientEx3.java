import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientEx3 {
    public static void main(String[] args) throws Exception
    {
        Socket s=new Socket("localhost",2000);
        System.out.println("Client is sending Request");
        for(;;)
        {
            DataInputStream dis=new DataInputStream(System.in);
            String str=dis.readLine();
            PrintStream ps=new PrintStream(s.getOutputStream());
            ps.println(str);

            DataInputStream dis1=new DataInputStream(s.getInputStream());
            String str1=dis.readLine();
            System.out.println("Server: "+str1);
            if(str1.equals("Bye"))
            {
                System.exit(0);
            }
        }
    }
}
