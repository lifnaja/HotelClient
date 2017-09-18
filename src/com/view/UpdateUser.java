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
@WebServlet("/updateuser")
public class UpdateUser extends HttpServlet {
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
    	
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	com.hotel.User user = null;
    	user = soap.getupdateUser(id);
		
		// out put web
    	out.print("<html>");
    	out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.println("<body>");
		
				
				out.println("<form action=\"saveuser\">");
				out.println("<input type=\"hidden\" name=\"id\" value=\""+id+"\"><br>");
				out.println("Firstname: <input type=\"text\" name=\"firstname\" value=\""+user.getFirstName()+"\"><br>");
				out.println("Lastname : <input type=\"text\" name=\"lastname\" value=\""+user.getLastName()+"\"><br>");
				out.println("Identity : <input type=\"text\" name=\"identity\" value=\""+user.getIdentity()+"\"><br>");
				out.println("Phone : <input type=\"text\" name=\"phone\" value=\""+user.getPhone()+"\"><br>");
				out.println("Email : <input type=\"text\" name=\"email\" value=\""+user.getEmail()+"\"><br>");
				out.println("Address : <input type=\"text\" name=\"address\" value=\""+user.getAddress()+"\"><br>");
				out.println("Username : <input type=\"text\" name=\"username\" value=\""+user.getUsername()+"\"><br>");
				out.println("Password : <input type=\"text\" name=\"password\" value=\""+user.getPassword()+"\"><br>");
				out.println("Type : <input type=\"text\" name=\"type\" value=\""+user.getType()+"\"><br>");
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
