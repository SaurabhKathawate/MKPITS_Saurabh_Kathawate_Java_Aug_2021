//example of throws


    class Calculation {
		int divide(int n1,int n2) throws Exception
		{
			int res=n1/n2;
			return res;
		}
	}

    public class Throws_Q1 {
        public static void main(String[] args)  {
Calculation c=new Calculation();
try
{
int r=c.divide(10,0);
System.out.println("result = " + r);
}catch(Exception ee)
{
	System.out.println(ee.toString());
}
System.out.println("program reached till the end");

    }
}
