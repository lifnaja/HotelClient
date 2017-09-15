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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter out = new PrintWriter( new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	request.setCharacterEncoding("UTF-8");
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	com.hotel.Room[] roomList = null;
    	
    		roomList = soap.allRoom();
    		
    	
    	// output
    	// out put web
    			response.setContentType( "text/html; charset=UTF-8" );
    			out.print("<html>");
    			out.println("<head><base href=\"http://localhost:8080/SoapClient/\">");
    			out.println("<meta charset=\"utf-8\">");
    			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
    			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
    			out.println("</head>");
    			out.print("<body>");
    			out.println("<h1>RoomType_And_Price</h1>");
    		
    			
    		
    			
    			
    			
    			
    			out.println("<table border=\"1\" class=\"table table-striped\" width=\"400\">");
    			out.println("<tr>");
    			out.println("<th>Room_id</th>");
    			out.println("<th>Room Type</th>");
    			out.println("<th>Room Price</th>");
    			
    			out.println("<tr>");
    					
    					for (com.hotel.Room room : roomList) {
    						out.println("<tr>");
        					out.println("<td width=\"200\">"+room.getId()+"</td>");
        					out.println("<td width=\"200\">"+room.getType()+"</td>");
        					out.println("<td width=\"200\">"+room.getPrice()+"</td>");
        					out.println("</tr>");
						}
    				
    			out.println("</table");
    			
    			out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
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
