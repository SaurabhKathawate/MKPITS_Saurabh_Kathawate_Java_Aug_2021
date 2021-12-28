public class th6 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getThreadGroup());
        }
    }
}
class ThreadEx6
{
    public static void main(String[] args)
    {
        th6 a=new th6();
        a.start();
    }
}