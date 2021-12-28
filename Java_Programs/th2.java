public class th2 extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("A-" + getName() + isAlive());
        }
    }
}
class ThreadEx2


{
    public static void main(String[] args)
    {
        th2 a= new th2();
        a.start();
        Thread b=Thread.currentThread();
        System.out.println(b);
    }
}

