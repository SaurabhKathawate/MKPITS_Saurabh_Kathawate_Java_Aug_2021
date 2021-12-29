class two
{
     void dis(String s)
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
public class th19 implements Runnable
{
    Thread t;
    String sob;
    one oc;
    th19(one oba,String s1)
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
class two2
{
    public static void main(String[] args)
    {
        one obx=new one();
        th19 ob1=new th19(obx,"Amar");
        th19 ob2=new th19(obx,"Akbar");
        th19 ob3=new th19(obx,"Antony");
    }
}