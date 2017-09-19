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
@WebServlet("/alluser")
public class Alluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

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
    	
    	com.hotel.User[] userList = null;
    	
    	userList = soap.allUser();
    		
    	
    	// output
    	// out put web
    			response.setContentType( "text/html; charset=UTF-8" );
    			out.print("<html>");
    			out.println("<head><base href=\"http://localhost:8080/HotelClient/\">");
    			out.println("<meta charset=\"utf-8\">");
    			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
    			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
    			out.println("</head>");
    			out.print("<body>");
    			out.println("<center>");
    			out.println("<h1>ข้อมูลผู้ใช้ระบบ</h1>");
    			out.println("<a href=\"creatuser\"><button type=\"button\" class=\"btn btn-success\">สร้าง</button></a>");
    			out.println("<table border=\"1\" class=\"table table-striped\" width=\"400\">");
    			out.println("<tr>");
    			out.println("<th>id</th>");
    			out.println("<th>ชื่อ</th>");
    			out.println("<th>นามสกุล</th>");
    			out.println("<th>เลขบัตรประชาชน</th>");
    			out.println("<th>เบอร์โทรศัพท์</th>");
    			out.println("<th>E-mail</th>");
    			out.println("<th>ที่อยู่</th>");
    			out.println("<th>ชื่อผู้ใช้</th>");
    			out.println("<th>ประเภทผู้ใช้</th>");
    			out.println("<th></th>");
    			out.println("<th></th>");
    			out.println("<tr>");
    					
    					for (com.hotel.User user : userList) {
    						out.println("<tr>");
        					out.println("<td width=\"200\">"+user.getId()+"</td>");
        					out.println("<td width=\"200\">"+user.getFirstName()+"</td>");
        					out.println("<td width=\"200\">"+user.getLastName()+"</td>");
        					out.println("<td width=\"200\">"+user.getIdentity()+"</td>");
        					out.println("<td width=\"200\">"+user.getPhone()+"</td>");
        					out.println("<td width=\"200\">"+user.getEmail()+"</td>");
        					out.println("<td width=\"200\">"+user.getAddress()+"</td>");
        					out.println("<td width=\"200\">"+user.getUsername()+"</td>");
        					
        					out.println("<td width=\"200\">"+user.getType()+"</td>");
        					String id = user.getId();
        					out.println("<td width=\"50px\"><a href=\"updateuser?id="+id+"\"><button type=\"button\" class=\"btn btn-danger\">แก้ไข</button></a></td>");
        					out.println("<td width=\"50px\"><a href=\"deleteuser?id="+id+"\"><button type=\"button\" class=\"btn btn-danger\">ลบ</button></a></td>");
							
        					out.println("</tr>");
						}
    				
    			out.println("</table");
    			
    			out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>");
    			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
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
