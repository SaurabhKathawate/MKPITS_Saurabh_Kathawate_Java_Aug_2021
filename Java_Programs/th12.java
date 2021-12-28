public class th12 extends Thread{
    public void run()
    {
        for(int i=0;i<=2;i++)
            System.out.println("A-"+getName());
    }
}
class ThreadEx12
{
    public static void main(String[] args) {
        th12 a1=new th12();
        th12 a2=new th12();
        th12 a3=new th12();

        a1.setPriority(10);
        System.out.println(a1);
        a1.start();
        a2.start();
        a3.start();

    }
}
