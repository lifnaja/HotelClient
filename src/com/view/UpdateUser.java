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
    	
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
    	
    	request.setCharacterEncoding("UTF-8");
    	
    
    	// value from web
    	String id = request.getParameter("id");
    	
    	// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	response.setContentType("text/html;charset-UTF-8");
    	com.hotel.User user = null;
    	user = soap.getupdateUser(id);
		
		// out put web
    	out.print("<html>");
    	out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
		out.println("</head>");
		out.println("</head>");
		out.println("<body>");
		out.print("<div class=\"container\">");
		
				out.println("<br><h1 class=\"display-3\">แก้ไขผู้ใช้</h1>");
				out.println("<form class=\"form-control\" action=\"saveuser\">");
				out.println("<input type=\"hidden\" name=\"id\" value=\""+id+"\"><br>");
				out.println("Firstname: <input class=\"form-control\" type=\"text\" name=\"lastname\" value=\""+user.getFirstName()+"\"><br>");
				out.println("Lastname : <input class=\"form-control\" type=\"text\" name=\"firstname\" value=\""+user.getLastName()+"\"><br>");
				out.println("Identity : <input class=\"form-control\" type=\"text\" name=\"identity\" value=\""+user.getIdentity()+"\"><br>");
				out.println("Phone : <input class=\"form-control\" type=\"text\" name=\"phone\" value=\""+user.getPhone()+"\"><br>");
				out.println("Email : <input class=\"form-control\" type=\"text\" name=\"email\" value=\""+user.getEmail()+"\"><br>");
				out.println("Address : <input class=\"form-control\" type=\"text\" name=\"address\" value=\""+user.getAddress()+"\"><br>");
				out.println("Username : <input class=\"form-control\" type=\"text\" name=\"username\" value=\""+user.getUsername()+"\"><br>");
				out.println("Password : <input class=\"form-control\" type=\"text\" name=\"password\" value=\""+user.getPassword()+"\"><br>");
				out.println("Type : <input class=\"form-control\" type=\"text\" name=\"type\" value=\""+user.getType()+"\"><br>");
				out.println("<input type=\"submit\" class=\"btn btn-primary\" value=\"บันทึก\">");
				out.println("</form>");
				out.println("</div>");

				out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
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
