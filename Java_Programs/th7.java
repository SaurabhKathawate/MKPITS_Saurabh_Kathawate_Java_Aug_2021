public class th7 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getUncaughtExceptionHandler());
        }
    }
}
class ThreadEx7
{
    public static void main(String[] args)
    {
        th7 a=new th7();
        a.start();
        Thread b=Thread.currentThread();
        System.out.println(b);

    }
}