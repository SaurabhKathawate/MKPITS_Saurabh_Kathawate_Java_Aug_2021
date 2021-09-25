//create a class User having fields username and pasword and setter and getter methods and checklogin and signup methods .
class Userlogin
{
	//private data members
    private String userName;
    private String password;

    //public getter and setter methods
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    //create method to check credentials
    public String checkLogin(String un,String pwd)
    {
		if(userName.equals(un) && password.equals(pwd) )
		{
			return "login successful for user " + userName;
		}
		else
		{
			return "invalid credentials , try again !";
		}
	}
	//method to save user credentials
	public String signup(String userName,String password)
	{
		setUserName(userName);
		setPassword(password);
		return "user details saved successfully";
	}
		public void display( )
		{
		}
    }

public class TestUserlogin
{
    public static void main(String[] args)
    {
		User u1=new User();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("1- process to create your account(signup ");
		System.out.println("enter username ");
		String un=scan.next();
		System.out.println("enter password ");
		String pwd=scan.next();
		String result=u1.signup(un,pwd);
		System.out.println(result);
		System.out.println("-------------------------------------------------");
		System.out.println("1- process to signin(login");
		System.out.println("enter username ");
		un=scan.next();
		System.out.println("enter password ");
		pwd=scan.next();
		result=u1.checkLogin(un,pwd);
		System.out.println(result);
    }
}