import java.util.*;//java is  package, util is subpackage
class TypeOfVariablesEx
{
static	int num; // static variable
 public static void main(String arg[])
{
	num=20;
	System.out.println("num = " + num);//20
	TypeOfVariablesEx t1=new TypeOfVariablesEx(); // t1 is instance of class TypeOfVariablesEx
        t1.num=40;
        System.out.println("num of t1 = " + t1.num);//40
        TypeOfVariablesEx t2=new TypeOfVariablesEx(); // t1 is instance of class TypeOfVariablesEx
        t2.num=60;
        System.out.println("num of t2 = " + t2.num);//60
}
}
