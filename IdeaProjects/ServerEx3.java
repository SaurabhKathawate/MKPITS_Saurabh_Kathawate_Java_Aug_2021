import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(2000);
        Socket s=ss.accept();
        for(;;)
        {
            DataInputStream dis=new DataInputStream((s.getInputStream()));
            String str=dis.readLine();
            System.out.println("Client: "+str);
            PrintStream ps=new PrintStream(s.getOutputStream());
            DataInputStream dis1=new DataInputStream(System.in);
            String str1=dis1.readLine();
            ps.println(str1);
            if(str1.equals("Bye"))
            {
                System.exit(0);
            }
        }
    }
}
