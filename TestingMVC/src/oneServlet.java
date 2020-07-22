import com.Login;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet( name = "oneServlet")
public class oneServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name = request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");

        Login bean = new Login();
        bean.setName(name);
        bean.setPassword(password);
        bean.setEmail(email);
        request.setAttribute("bean",bean);

        boolean status = bean.validate();

        if(status)
        {
            RequestDispatcher rd=request.getRequestDispatcher("successful.jsp");
            rd.forward(request,response);
        }
        else
        {
            RequestDispatcher rdp = request.getRequestDispatcher("error.jsp");
            rdp.forward(request,response);
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
