import mkpits1.Result;
import java.util.*;
class TestResult  {
public static void main(String[] arg)
{
	Result r1=new Result();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter phy marks");
	int phy=scan.nextInt();
	System.out.println("enter chem marks");
	int chem=scan.nextInt();
	System.out.println("enter bio marks");
	int bio=scan.nextInt();
	int total=r1.calculateTotal(phy,chem,bio);
	System.out.println("total marks " + total);
	float percentage=r1.calculatePercentage();
	System.out.println("percentage : " + percentage);
String grade=r1.calculateGrade();
System.out.println("grade : " + grade);
}


}
