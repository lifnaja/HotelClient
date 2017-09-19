package com.view;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hotel.HotelServiceInterfaceProxy;
import com.hotel.Room;

/**
 * Servlet implementation class findRoomBusy
 */
@WebServlet("/findRoomBusy")
public class findRoomBusy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
		request.setCharacterEncoding("UTF-8");
		
    	// value from web
    	String startDate = request.getParameter("startDate");
    	String endDate = request.getParameter("endDate");

    
    	
    	
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	Room[] roomList = null;
   
    	roomList = soap.findRoomBusy(startDate, endDate);	
    	response.setContentType( "text/html; charset=UTF-8" );
    	
    	
		// out put web
    	out.print("<html>");
    	out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		
			out.print("<div class=\"container\">");
			out.println("<br><h1 class=\"display-3\">ข้อมูลห้องพักที่ว่าง</h1><br>");
			out.println("<table class=\"table table-bordered\" ");
			out.println("<tr>");
			out.println("<th>หมายเลขห้อง</th>");
			out.println("<th>ประเภทห้อง</th>");
			out.println("<th>ราคา</th>");

			out.println("<tr>");
				for (com.hotel.Room room : roomList) {
					out.println("<tr>");
					out.println("<td>"+room.getRoomID()+"</td>");
					out.println("<td>"+room.getType()+"</td>");
					out.println("<td>"+room.getPrice()+"</td>");
					out.println("</tr>");
				}
				out.println("</table");
		
		out.println("</center>");
		out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
		out.println("</div>");
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
