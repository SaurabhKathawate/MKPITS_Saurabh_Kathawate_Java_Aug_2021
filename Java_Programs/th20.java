class one
{
   synchronized void dis(String s)
    {
        System.out.print("[ "+s);
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
        {
            System.out.print(" ]");
        }
    }
}
public class th20 implements Runnable
{
    Thread t;
    String sob;
    one oc;
    th20(one oba,String s1)
    {
        oc=oba;
        sob=s1;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        oc.dis(sob);
    }
}
class one2
{
    public static void main(String[] args)
    {
        one obx=new one();
        th20 ob1=new th20(obx,"Amar");
        th20 ob2=new th20(obx,"Akbar");
        th20 ob3=new th20(obx,"Antony");
    }
}