public class th1 extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("A-" +getId());
        }
    }
}
class ThreadEx1
{
    public static void main(String[] args)
    {
        th1 a=new th1();
        a.start();
        Thread b=Thread.currentThread();
        System.out.println(b);
    }
}
