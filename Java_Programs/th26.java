public class th26 implements Runnable{
    public void run(){
        System.out.println("Hi "+Thread.currentThread().activeCount());
    }
}
class ThreadEx26{
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("Java");
        System.out.println(tg);
        th26 obj1=new th26();
        Thread t1=new Thread(tg,obj1,"one");
        Thread t2=new Thread(tg,obj1,"two");
        Thread t3=new Thread(tg,obj1,"three");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1);
    }
}
