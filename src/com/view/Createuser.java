package com.view;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Createroom
 */
@WebServlet("/createuser")
public class Createuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
	
	// value from web
	String id = request.getParameter("id");
	response.setContentType("text/html;charset-UTF-8");
	// out put web
	out.print("<html>");
	out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
	out.println("<meta charset=\"utf-8\">");
	out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
	out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
	out.println("</head>");
	out.print("<body>");
	out.print("<div class=\"container\">");
	out.print("<br>");
	out.print("<br>");
	out.println("<h1 class=\"display-1\">สร้างผู้ใช้</h1>");
	out.println("<form action=\"saveuser\">");
	out.println("<div class=\"form-group\">");
	out.println("Firstname: <input class=\"form-control\" type=\"text\" name=\"lastname\" value=\"\"><br>");
	out.println("Lastname : <input class=\"form-control\" type=\"text\" name=\"firstname\" value=\"\"><br>");
	out.println("Identity : <input class=\"form-control\" type=\"text\" name=\"identity\" value=\"\"><br>");
	out.println("Phone : <input class=\"form-control\" type=\"text\" name=\"phone\" value=\"\"><br>");
	out.println("Email : <input class=\"form-control\" type=\"text\" name=\"email\" value=\"\"><br>");
	out.println("Address : <input class=\"form-control\" type=\"text\" name=\"address\" value=\"\"><br>");
	out.println("Username : <input class=\"form-control\" type=\"text\" name=\"username\" value=\"\"><br>");
	out.println("Password : <input class=\"form-control\" type=\"text\" name=\"password\" value=\"\"><br>");
	out.println("Type : <input class=\"form-control\" type=\"text\" name=\"type\" value=\"\"><br>");
	out.println("<input type=\"submit\" class=\"btn btn-primary\" value=\"บันทึก\">");
	out.println("</div>");
	out.println("</form>");
	out.println("</div>");
	out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
	out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
	out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
	out.println("</body>");
	out.println("</html>");
}
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
		
	}

}
