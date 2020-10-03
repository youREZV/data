import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class data extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public data(){
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String type=request.getParameter("type");
		JSONObject temp= new JSONObject();
		response.setContentType("text/json");
		if(type.equals("student")) {
			response.getWriter().println("estudiante");
		}else if(type.equals("both")) {
			response.getWriter().println("boths");
		}else {
			response.getWriter().println("subject");
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		JSONObject temp= new JSONObject(request.getReader().lines().collect(Collectors.joining(System.lineSeparator())));
		response.setContentType("text/json");
		
		try {
			//save data
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error was ocurred");
			temp=null;
			response.sendError(HttpServletResponse.SC_GATEWAY_TIMEOUT);
		}
	}
}
