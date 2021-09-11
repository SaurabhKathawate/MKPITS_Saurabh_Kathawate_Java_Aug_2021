//A local variable cannot be defined with "static" keyword.

import java.util.*;//java is  package, util is subpackage
class Local_Variable_2
{
 public static void main(String arg[])
{
//System.out.println("num = " + num); error since num variable is local in display method
display();
}
 void display()
{
	int num=20;
	System.out.println("num = " + num);
}

}
