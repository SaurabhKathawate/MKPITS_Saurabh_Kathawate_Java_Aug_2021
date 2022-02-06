import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("uname");
        String password=request.getParameter("pass");

        PrintWriter out=response.getWriter();
        out.println(username);
        out.println(password);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            out.println("database connected");
            Statement stmt=con.createStatement();
            String qr=("insert into table1 values ('"+username+"','"+password+"')");
            stmt.executeUpdate(qr);

            out.println("data inserted");
        }catch(Exception e){
            out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
