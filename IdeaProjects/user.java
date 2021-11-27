import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//program to select record from user table
public class user {
    public static void main(String arg []){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/22_nov","root","");
           System.out.println("Successfully Connected");
           Statement stmt=con.createStatement();
           String qr="Select * from user";
           ResultSet rs=stmt.executeQuery(qr);
           while (rs.next()){
               System.out.println("id:"+rs.getInt(1)+"  name:"+rs.getString(2)+"  password:"+rs.getString(3));
           }
           con.close();
       }catch (Exception ee){
           System.out.println(ee.toString());
       }
    }
}
