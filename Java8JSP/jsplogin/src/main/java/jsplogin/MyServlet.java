package jsplogin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/index")
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.print("Hello,Good After noon");
		
		req.setAttribute("org_Name", "TCS");
		out.print(req.getAttribute("org_Name"));
		
		
		HttpSession session = req.getSession();
		session.setAttribute("firstName", "Rahul");
		
		out.print(session.getAttribute("firstName"));
	}
}
