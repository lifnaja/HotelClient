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
@WebServlet("/createroom")
public class Createroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
	
	// value from web
	String id = request.getParameter("id");
	response.setContentType("text/html;charset-UTF-8");
	// out put web
	out.print("<html>");
	out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
	out.print("<body>");
	
	out.println("<form action=\"save\">");
	out.println("RoomID : <input type=\"text\" name=\"roomID\" value=\"\"><br>");
	out.println("RoomType: <input type=\"text\" name=\"type\" value=\"\"><br>");
	out.println("Price : <input type=\"text\" name=\"price\" value=\"\"><br>");
	out.println("<input type=\"submit\" value=\"allroom\">");
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
