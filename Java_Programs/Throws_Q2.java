//

class Saving {
		String deposit(int amt) throws Exception
		{
			return "amount deposited";
		}
	}

    public class Throws_Q2 {
        public static void main(String[] args)  {
Saving s=new Saving();
try
{
String str=s.deposit(100);
System.out.println(str);
}
catch(Exception ee) {
	System.out.println(ee.toString());
}
    }
}
