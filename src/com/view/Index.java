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
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = new PrintWriter( new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
		
		request.setCharacterEncoding("UTF-8");
		
		HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
		
		
		response.setContentType( "text/html; charset=UTF-8" );
		
		out.print("<html>");
		out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.print("<body>");
		
		out.println("<center>");
		
		
		out.println("<img src=\"picture/hotel.jpg\" width=\"300px\"></img>");
		out.println("<br><img src=\"picture/hotelIcon.png\"></img>");
		out.println("<a href=\"allroom\">จัดการข้อมูลห้อง</a><br>");
		
		out.println("<img src=\"picture/team.png\"></img>");
		out.println("<a href=\"alluser\">จัดการข้อมูลผู้ใช้</a><br>");
		
		out.println("<div><img src=\"picture/event.png\"></img>");
		out.print("<a href=\"findRoom\">หาห้องพักที่ว่าง</a></div>");
		
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
