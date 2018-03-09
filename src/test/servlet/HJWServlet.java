package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */

public class HJWServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		boolean used=false;
		if("ajax".equals(name)){
			used=true;
		}else{
			used=false;
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print(used);
		out.flush();
		out.close();
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		this.doGet(req, resp);
		
	}

	

}
