package Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username= "";
		username= request.getParameter("username");
		
		try{
		//String accessToken = 
		String query1 = "SELECT uid2 FROM friend WHERE uid1 = me()";
		String urltemp = "https://api.facebook.com/method/fql.query?query=" + URLEncoder.encode(""+query1, "UTF-8") + "&format=json";
		
		 //if(accessToken != null)
             urltemp = urltemp + "&access_token=AAACEdEose0cBAPr4eyHvQQd55YriCLZBNWuSsJbEDt8UZCMNYWKcqKbeZB7tmF9FzFTIW3jyJOaUa0y6vElBrBKfKZA0lKT9oa8rTMza9ng5vuLIAu3c" ;
		
		String host = "http://www.facebook.com"+"/fql?q="+query1;
		URL url = new URL(urltemp);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		System.out.println("ghooochuuuu ---- 1");
		conn.connect();
		//InputStream in = conn.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String text = "";
		while((text = reader.readLine())!=null){
			//String text = reader.readLine();
			System.out.println(text);
			System.out.println("ghooochuuuu ---- 2");
		} // end of while 
		System.out.println("Done reading what fb sent");
		reader.close();
		}
		catch(Exception e){
			System.out.println("Something's crashed "+e);
		}
		System.out.println("Closed all");
		
		
		PrintWriter pw = response.getWriter();
		pw.write("hello world " + username);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
