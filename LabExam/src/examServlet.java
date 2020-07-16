import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet(name="examServlet")
public class examServlet extends javax.servlet.http.HttpServlet {
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/bitam";
    static final String DB_USER ="root";
    static final String DB_PASS ="123";

    void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String name = request.getParameter("name");
        String regno = request.getParameter("regno");
        String grade = request.getParameter("grade");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String info = request.getParameter("info");

        try{

            //registr
            Class.forName("JDBC_DRIVER");
            //connection
            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            //SQL statements
            Statement stmt=conn.createStatement();
            String sql = "INSERT INTO bitam (name,regno,grade,phone,email,gender,info) VALUES ('"+name+"','"+regno+"','"+grade+"','"+phone+"','"+email+"','"+gender+"','"+info+"')";
            int outi = stmt.executeUpdate(sql);
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            //finally
        }
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request,response);
    }
}
