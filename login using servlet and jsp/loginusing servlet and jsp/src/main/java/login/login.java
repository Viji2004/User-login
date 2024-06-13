package login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
String user=request.getParameter("user");
String pass=request.getParameter("pass");
if(user.equals("abc") && pass.equals("123")) {
	
		HttpSession session=request.getSession();
		session.setAttribute("user",user);
		response.sendRedirect("welcome.jsp");}
else {
		response.sendRedirect("login1.jsp");
	}
	
	
	
}
		
	}

