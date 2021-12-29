public class th18 implements Runnable
{
    Thread t;
    th18()
    {
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("even");
    }
}

class odd implements Runnable
{
    Thread t;
    odd()
    {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("odd");
    }
}

class ThreadEx18
{
    public static void main(String[] args)
    {
        th18 a=new th18();
        odd b=new odd();
    }
}