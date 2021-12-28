public class th8 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getDefaultUncaughtExceptionHandler());
        }
    }
}
class ThreadEx8
{
    public static void main(String[] args)
    {
        th8 a=new th8();
        a.start();
    }
}