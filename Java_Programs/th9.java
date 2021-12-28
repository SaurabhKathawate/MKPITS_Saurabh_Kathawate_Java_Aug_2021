public class th9 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getAllStackTraces());
        }
    }
}
class ThreadEx9
{
    public static void main(String[] args)
    {
        th9 a=new th9();
        a.start();
    }
}