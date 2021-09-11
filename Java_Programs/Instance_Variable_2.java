//example of instance variable
import java.util.*;//java is  package, util is subpackage
class Instance_Variable_2
{
	int num; // instance variable
 public static void main(String arg[] )
{
	//creating instance (object ) of squarenumber class
	SquareNumber s1=new SquareNumber();
	s1.num=5;
	System.out.println(" number stored in s1 instance var = " + s1.num);
	SquareNumber s2=new SquareNumber();
		s2.num=7;
	System.out.println(" number stored in s2 instance var = " + s2.num);
}
}
