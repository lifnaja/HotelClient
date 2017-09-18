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
	response.setContentType("text/html;charset-UTF-8");
	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
	
	// value from web
	String id = request.getParameter("id");
	
	// out put web
	out.print("<html>");
	out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
	out.print("<body>");
	
	out.println("<form action=\"saveuser\">");
	out.println("Firstname: <input type=\"text\" name=\"firstname\" value=\"\"><br>");
	out.println("Lastname : <input type=\"text\" name=\"lastname\" value=\"\"><br>");
	out.println("Identity : <input type=\"text\" name=\"identity\" value=\"\"><br>");
	out.println("Phone : <input type=\"text\" name=\"phone\" value=\"\"><br>");
	out.println("Email : <input type=\"text\" name=\"email\" value=\"\"><br>");
	out.println("Address : <input type=\"text\" name=\"address\" value=\"\"><br>");
	out.println("Username : <input type=\"text\" name=\"username\" value=\"\"><br>");
	out.println("Password : <input type=\"text\" name=\"password\" value=\"\"><br>");
	out.println("Type : <input type=\"text\" name=\"type\" value=\"\"><br>");
	out.println("<input type=\"submit\" value=\"alluser\">");
	out.println("</form>");
	
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
