import mkpits1.Employee;
import java.util.*;
class TestEmployee  {
public static void main(String[] arg)
{
	Employee r1=new Employee();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter empno");
	int empno=scan.nextInt();
	System.out.println("enter empname");
	String empname=scan.next();
	System.out.println("enter basic salary");
	int basicsalary=scan.nextInt();
	r1.insert(empno,empname,basicsalary);
	r1.calculateBonus();
	r1.display();
}


}
