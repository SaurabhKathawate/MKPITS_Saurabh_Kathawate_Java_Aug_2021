public class th22 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++)
            if(isDaemon())
                System.out.println(getName()+"is daemon thread");
            else
                System.out.println(getName()+"is not daemon thread");
    }
}
class ThreadEx22{
    public static void main(String[] args) {
        th22 a=new th22();
        th22 b=new th22();
        th22 c=new th22();

        a.start();
        b.setDaemon(true);
        b.start();
        c.start();
    }
}
