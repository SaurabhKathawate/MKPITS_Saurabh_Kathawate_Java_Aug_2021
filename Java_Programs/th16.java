public class th16 implements Runnable
{
    Thread t;
    th16()
    {
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        System.out.println("Hi "+t.getName());
    }
}
class ThreadEx16
{
    public static void main(String[] args)
    {
        th16 a=new th16();
    }
}
