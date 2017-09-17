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
 * Servlet implementation class SaveAction
 */
@WebServlet("/save")
public class SaveAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    	response.setContentType("text/html;charset-UTF-8");
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	String id = request.getParameter("id");
    	String roomID =  request.getParameter("roomID");
    	String type = request.getParameter("type");
    	String price = request.getParameter("price");
    	
    	
    	
		
		// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	boolean result;
		if(id == null) {
			result = soap.createRoom(roomID, type, price);
		}else {
			result = soap.updateRoom(id, roomID, type, price);
		}
				
		String output = "";
		if (result == false) {
			output = "Susess";
		}else {
			output = "Un Susess";
		}
		
		// out put web
		out.print("<html>");
		out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.print("<body>");
		out.println("<center>");
		out.println("<h2>ผลลัพทธ์</h2>");
		out.println(output+"<br><br>");
		out.println("<a href=\"course\">กลับสู่หน้าหลัก</a>");
		out.println("</center>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
