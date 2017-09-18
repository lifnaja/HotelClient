package com.view;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.HotelServiceInterfaceProxy;

/**
 * Servlet implementation class FormFindRoom
 */
@WebServlet("/findRoom")
public class FormFindRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.setContentType("text/html;charset-UTF-8");
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	request.setCharacterEncoding("UTF-8");
    	
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	response.setContentType( "text/html; charset=UTF-8" );
    	
		
		// out put web
    	out.print("<html>");
    	out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.println("<body>");
		out.println("<center>");
				
			out.println("<img src=\"picture/event1.png\" ></img>");
				out.println("<form action=\"findRoomBusy\">");
				out.println("check-in : <input type=\"date\" name=\"startDate\" value=\"\"><br>");
				out.println("check-out : <input type=\"date\" name=\"endDate\" value=\"\"><br>");
				out.println("<br><input type=\"submit\" value=\"ค้นหา\">");
				out.println("</form>");
				
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
