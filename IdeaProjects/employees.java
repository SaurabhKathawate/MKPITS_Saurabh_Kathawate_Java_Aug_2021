//program to select record from employees table
import java.sql.*;
public class employees {
    public static void main(String arg[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/22_nov","root","");
            System.out.println("Successfully Connected");
            Statement stmt= con.createStatement();
            String qr="Select * from employees";
            ResultSet rs= stmt.executeQuery(qr);
            while (rs.next()){
                System.out.println("id:"+rs.getInt(1)+"  name:"+rs.getString(2)+"  address:"+rs.getString(3));
            }
            con.close();
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}

