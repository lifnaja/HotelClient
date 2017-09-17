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
 * Servlet implementation class UpdateAction
 */
@WebServlet("/UpdateAction")
public class UpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAction() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.setContentType("text/html;charset-UTF-8");
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	String id = request.getParameter("id");
    	
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	com.hotel.Room room = null;
    	room = soap.getupdateRoom(id);
		
		// out put web
    	out.print("<html>");
    	out.println("<head><base href=\"http://localhost:8080/hotelClient3/\"></head>");
		out.println("<body>");
		
				
				out.println("<form action=\"save\">");
				out.println("<input type=\"hidden\" name=\"id\" value=\""+id+"\"><br>");
				out.println("ID : <input type=\"text\" name=\"course_id\" value=\""+room.getRoomID()+"\"><br>");
				out.println("type :<input type=\"text\" name=\"name\" value=\""+room.getType()+"\"><br>");
				out.println("price : <input type=\"text\" name=\"description\" value=\""+room.getPrice()+"\"><br>");
				out.println("<input type=\"submit\" value=\"á¡éä¢\">");
				out.println("</form>");
				
		
		out.println("</body>");
		out.println("</html>");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
