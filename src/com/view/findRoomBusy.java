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
    	out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.println("<body>");
		out.println("<center>");
			
			out.println("<p>ข้อมูลห้องพักที่ว่าง</p>");
			out.println("<table>");
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
