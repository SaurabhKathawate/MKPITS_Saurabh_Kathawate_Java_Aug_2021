package bank;
import sbi.Account;

class Customer{
public static void main(String[] arg)
{
Account act=new Account();
String str=act.deposit(100);
System.out.println(str);
}


}
