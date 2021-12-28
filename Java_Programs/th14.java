public class th14 extends Thread{
    public void run()
    {
        for(int i=0;i<=2;i++)
            System.out.println("A-"+getName());
    }
}
class ThreadEx14
{
    public static void main(String[] args) {
        th14 a1=new th14();
        th14 a2=new th14();
        th14 a3=new th14();

        a1.start();
        a2.start();
        a3.start();
        try{
            System.out.println("Suspended");
            a1.suspend();
            Thread.sleep(1000);
            System.out.println("Running");
            a1.resume();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
