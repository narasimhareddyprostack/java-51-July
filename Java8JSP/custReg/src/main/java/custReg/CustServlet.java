package custReg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/custReg")
public class CustServlet extends HttpServlet {
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out = resp.getWriter();	
			
			String fName=req.getParameter("firstName");
			String lName=req.getParameter("lastName");
			String emailid=req.getParameter("emailid");
			String gender=req.getParameter("gender");
			String mobile=req.getParameter("mobile");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro18", "root", "root");
				String sql_st="insert into customer values(?,?,?,?,?)";
				PreparedStatement st=con.prepareStatement(sql_st);
				st.setString(1, fName);
				st.setString(2, lName);
				st.setString(3, emailid);
				st.setString(4, gender);
				st.setString(5, mobile);
				int result= st.executeUpdate();
				
				if(result >0) {
					//send welcome mail to customer
					resp.setContentType("text/html");
					out.print("<h2>New Customer Registered Successfully</h2>");
				}
				else {
					out.print("<h2>Registration Failed</h2>");
				}
			}
			catch(Exception e) {
				
			}
		
		}
}
