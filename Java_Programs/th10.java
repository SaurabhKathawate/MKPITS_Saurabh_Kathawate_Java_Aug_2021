public class th10 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getContextClassLoader());
        }
    }
}
class ThreadEx10
{
    public static void main(String[] args)
    {
        th10 a=new th10();
        a.start();
    }
}