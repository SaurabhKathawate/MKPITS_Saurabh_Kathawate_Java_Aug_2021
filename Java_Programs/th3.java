public class th3 extends Thread{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getPriority());
        }
    }
}
class ThreadEx3
{
    public static void main(String[] args)
    {
        th3 a=new th3();
        a.start();
        Thread b=Thread.currentThread();
        System.out.println(b);
    }
}
