interface inter2
{
    void display();
}
class metref2
{
    public static void name1()
    {
        System.out.println("Static Method Body");
    }
}
class metref3
{
    public void name2()
    {
        System.out.println("Without Static Method Body");
    }
}

public class Method_Reference_Q2 {
    public static void main(String[] args) {
//        inter2 obj1= () -> System.out.println("My Interface");
//        obj1.display();

//        inter2 obj1= metref2::name1;
//        obj1.display();

        metref3 obj2=new metref3();
        inter2 obj1=obj2::name2;
        obj1.display();
    }
}
