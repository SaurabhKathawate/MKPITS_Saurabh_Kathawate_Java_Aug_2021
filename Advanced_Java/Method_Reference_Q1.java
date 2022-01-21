interface inter1
{
    void display();
}
class metref1
{
    public static void name()
    {
        System.out.println("Static Method Body");
    }
}

public class Method_Reference_Q1 {
    public static void main(String[] args) {
//        inter1 obj = () -> System.out.println("My Interface");      //by lambda function
//        obj.display();

        inter1 obj = metref1::name;                                   //by method reference
        obj.display();
    }
}
