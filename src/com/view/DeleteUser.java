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
 * Servlet implementation class Create
 */
@WebServlet("/deleteuser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.setContentType("text/html;charset-UTF-8");
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	// value from web
    	String id = request.getParameter("id");
    	System.out.println(id);
    	//connect soap
   	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	boolean result = soap.deleteUser(id);
    	
		String output = "";
		if (result == false) {
			output = "Un susess";
		}else {
			output = "Sussess";
		}
		
		// out put web
		out.print("<html>");
		out.println("<head><base href=\"http://localhost:8080/HotelClient/\"></head>");
		out.print("<body>");
		out.println("<center>");
		out.println("<h2>‡∏?‡∏•‡∏•‡∏±‡∏?‡∏ó‡∏?‡π?</h2>");
		out.println(output+id+"<br><br>");
		out.println("<a href=\"alluser\">Return Allroom √’‡∑‘√Ïπ°≈—∫  ÕÕ≈√Ÿ¡</a>");
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
