public class th5 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("A-"+getState());
        }
    }
}
class ThreadEx5
{
    public static void main(String[] args)
    {
        th5 a=new th5();
        a.start();
    }
}