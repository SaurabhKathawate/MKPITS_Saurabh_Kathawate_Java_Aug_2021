import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class th24 extends Thread{
    public void serviceRequest(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void run(){
       System.out.println(getName()+" Thread Start Working");
       serviceRequest();
       System.out.println(getName()+" Thread Finished Working");
    }
}
class ThreadEx24{
    public static void main(String[] args) {
        th24 a=new th24();
        th24 b=new th24();
        th24 c=new th24();

        a.start();
        b.setDaemon(true);
        b.start();
        c.start();

        ExecutorService ex= Executors.newFixedThreadPool(2);
        ex.execute(a);
        ex.execute(b);
        ex.execute(c);

        ex.shutdown();
        for(;! ex.isTerminated();){}
        //while(! ex.isTerminated()){}
        System.out.println("All thread word Finished");
    }
}
