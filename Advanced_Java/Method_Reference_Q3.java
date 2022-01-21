interface inter3
{
    void display();
}
class metref4
{
    public static void name1()
    {
        System.out.println("Static Method Body");
    }
}
class metref5
{
    public void name2()
    {
        System.out.println("Without Static Method Body");
    }
}
class metref6
{
    public metref6()
    {
        System.out.println("My Constructor");
    }
}

public class Method_Reference_Q3 {
    public static void main(String[] args) {
//        inter3 obj1= () -> System.out.println("My Interface");
//        obj1.display();

//        inter3 obj1= metref4::name1;
//        obj1.display();

//        metref5 obj2=new metref5();
//        inter3 obj1=obj2::name2;
//        obj1.display();

        inter3 obj1=metref6::new;
        obj1.display();
    }
}
