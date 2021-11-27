import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class usersform extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2,b3,b4;
    usersform(){
        l1=new JLabel("Username");
        l1.setBounds(20,50,100,25);
        add(l1);
        t1=new JTextField();
        t1.setBounds(150,50,100,25);
        add(t1);
        l2=new JLabel("Password");
        l2.setBounds(20,100,100,25);
        add(l2);
        p1=new JPasswordField();
        p1.setBounds(150,100,100,25);
        add(p1);

        b1=new JButton("Save");
        b1.setBounds(20,150,100,25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    //System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String qr="insert into users (username,pwd) values ('"+t1.getText()+"','"+p1.getText()+"')";
                    stmt.executeUpdate(qr);
                    con.close();
                    l3.setText("Status:Record Saved");
                }  catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(150,150,100,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    //System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String qr="update users set pwd='"+p1.getText()+"' where username='"+t1.getText()+"'";
                    stmt.executeUpdate(qr);
                    con.close();
                    l3.setText("Status:Record Updated");
                }  catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(20,200,100,25);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    Statement stmt=con.createStatement();
                    String qr="Delete from users where username='"+t1.getText()+"'";
                    stmt.executeUpdate(qr);
                    con.close();
                    l3.setText("Status: Record Deleted");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(150,200,100,25);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    //System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String qr="select * from users where username='"+t1.getText()+"'";
                    ResultSet rs=stmt.executeQuery(qr);
                    int flag=0;
                    while (rs.next())
                    {
                        flag=1;
                        p1.setText(rs.getString(3));
                    }
                    if (flag==0)
                    {
                        l3.setText("NO Record Found");
                    }
                    con.close();
                    l3.setText("Status:Record Searched");
                }  catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l3=new JLabel("Status:");
        l3.setBounds(20,250,200,25);
        add(l3);
        setTitle("usersform");
        setLayout(null);
        setSize(300,400);
        setVisible(true);


    }
    public static void main(String arg []){
        new usersform();
    }
}
