public class th4 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getStackTrace());
        }
    }
}
class ThreadEx4
{
    public static void main(String[] args)
    {
        th4 a=new th4();
        a.start();
        Thread b=Thread.currentThread();
        System.out.println(b);

    }
}
