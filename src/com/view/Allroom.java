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
 * Servlet implementation class Allroom
 */
@WebServlet("/Allroom")
public class Allroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    	

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter out = new PrintWriter( new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	request.setCharacterEncoding("UTF-8");
    	String id = request.getParameter("id");
    	
		// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	com.hotel.Room[] roomList = null;
    	
    		roomList = soap.allRoom();
    		
    	
    	// output
    	// out put web
    			response.setContentType( "text/html; charset=UTF-8" );
    			out.print("<html>");
    			out.println("<head><base href=\"http://localhost:8080/SoapClient/\"></head>");
    			out.print("<body>");
    			
    			out.println("<center>");
    			
    		
    			
    			
    			
    			
    			out.println("<table border=\"1\">");
    			out.println("<tr>");
    			out.println("<th>Room_id</th>");
    			out.println("<th>Room Type</th>");
    			out.println("<th>Room Price</th>");
    			
    			out.println("<tr>");
    					
    					for (com.hotel.Room room : roomList) {
    						out.println("<tr>");
        					out.println("<td>"+room.getId()+"</td>");
        					out.println("<td>"+room.getType()+"</td>");
        					out.println("<td>"+room.getPrice()+"</td>");
        					out.println("</tr>");
						}
    				
    			out.println("</table");
    			out.println("</center>");
    			out.println("</body>");
    			out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
