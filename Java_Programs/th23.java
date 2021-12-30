import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class th23 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++)
            if(isDaemon())
                System.out.println(getName()+"is daemon thread");
            else
                System.out.println(getName()+"is not daemon thread");
    }
}
class ThreadEx23{
    public static void main(String[] args) {
        th23 a=new th23();
        th23 b=new th23();
        th23 c=new th23();

        a.start();
        b.setDaemon(true);
        b.start();
        c.start();

        ExecutorService ex= Executors.newFixedThreadPool(2);
        ex.execute(a);
        ex.execute(b);
        ex.execute(c);
    }
}
