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
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = new PrintWriter( new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
		
		request.setCharacterEncoding("UTF-8");
		
		HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
		
		
		response.setContentType( "text/html; charset=UTF-8" );
		
		out.print("<html>");
		out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
		out.println("</head>");
		out.print("<body>");
		
		out.println("<center>");
		out.print("<div class=\"container\">");
		out.println("<br><br><h1 class=\"display-1\">Urban Hotel</h1>");
		out.println("<img src=\"picture/hotel.jpg\" width=\"800px\"></img>");
		//out.println("<br><img src=\"picture/hotelmini.png\"></img><br>");
//		out.println("<div class=\"btn-group-vertical\">");
//		out.println("<a href=\"allroom\" class=\"button\"></a>");
//		out.println("&nbsp&nbsp&nbsp<a href=\"allroom\" class=\"btn btn-info\" role=\"button\">จัดการข้อมูลห้อง<br></a><br>");
//		//out.println("<img src=\"picture/team.png\"></img>");
//		out.println("<a href=\"alluser\" class=\"button\"></a>");
//		out.println("&nbsp&nbsp&nbsp<a href=\"alluser\" class=\"btn btn-info\" role=\"button\">จัดการข้อมูลผู้ใช้</a><br>");
//		//out.println("<div><img src=\"picture/event.png\"></img>");
//		out.println("<a href=\"findRoom\" class=\"button\"></a>");
//		out.println("&nbsp&nbsp&nbsp<a href=\"findRoom\" class=\"btn btn-info\" role=\"button\">หาห้องพักที่ว่าง<br></a><br>");
//		out.println("</div>");
//		out.println("</div>");
		
		out.println("<div class=\"btn-group btn-group-lg\">");
		out.println("<a href=\"allroom\" class=\"btn btn-primary\">จัดการห้องพัก</a>");
		out.println("<a href=\"alluser\" class=\"btn btn-primary\">จัดการผู้ใช้</a>");
		out.println("<a href=\"findRoom\" class=\"btn btn-primary\">ค้นหาห้อง</a>");
		out.println(" </div>");
		out.println("</center>");
		out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
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
