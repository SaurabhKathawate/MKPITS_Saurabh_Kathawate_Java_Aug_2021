class User
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
    public String checkLogin(String userName,String password)
    {
		if(userName.equals("admin") && password.equals("admin") )
		{
			return "login successful for user " + userName;
		}
		else
		{
			return "invalid credentials , try again !";
		}
	}
}

public class TestUser
{
	public static void main(String[] args)
	{
		User u1=new User();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter username ");
		String un=scan.next();
		System.out.println("enter password ");
		String pwd=scan.next();
		u1.setUserName(un);
		u1.setPassword(pwd);
		String result=u1.checkLogin(u1.getUserName(),u1.getPassword());
		System.out.println(result);
    }
}