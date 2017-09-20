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
@WebServlet("/saveuser")
public class SaveUser extends HttpServlet {
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
    	String firstname =  request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	String identity = request.getParameter("identity");
    	String phone = request.getParameter("phone");
    	String email = request.getParameter("email");
    	String address = request.getParameter("address");
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	String type = request.getParameter("type");
    	
    	
    	
		
		// connect soap
    	HotelServiceInterfaceProxy soap = new HotelServiceInterfaceProxy();
    	
    	boolean result = false;
		if(id == null) {
			result = soap.createUser(firstname, lastname, identity, phone, email, address ,username ,password,type );
		}else {
			result = soap.updateUser(id, firstname, lastname, identity, phone, email, address ,username ,password,type );
		}
				
		String output = "";
		if (result == false) {
			output = "บันทึกไม่สำเร็จ";
		}else {
			output = "บันทึกสำเร็จ";
		}
		
		// out put web
		out.print("<html>");
		out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
		out.println("</head>");
		out.print("<body>");
		out.print("<div class=\"container\">");
		
		out.println("<h2>ผลลัพธ์</h2>");
		out.println(output+"<br><br>");
		out.println("<a href=\"alluser\" class=\"btn btn-info\" role=\"button\">ดูข้อมูลผู้ใช้</a>");
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
