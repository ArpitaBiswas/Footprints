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
		
		//Initiate session 
		
		
		//Search within session 
		
		
		//Retrieve Results via Polling
		
		
		
		//Get details on particular search result

		
		
		try{
		//String accessToken = 
		String base = "http://api.hotwire.com/v1/deal/hotel";
		//String query = "&limit=1&dest=NYC&distance=*~30&starrating=4~*&sort=price";
		//https://www.kayak.com/k/ident/apisession?username=uname&password=pwd

		 //if(accessToken != null)
         //    urltemp = urltemp + "&access_token=AAACEdEose0cBAPr4eyHvQQd55YriCLZBNWuSsJbEDt8UZCMNYWKcqKbeZB7tmF9FzFTIW3jyJOaUa0y6vElBrBKfKZA0lKT9oa8rTMza9ng5vuLIAu3c" ;
		
		//String host = "http://www.facebook.com"+"/fql?q="+query1;
		URL url = new URL(base);
		
		
		System.out.println("TP 1 --------");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.addRequestProperty("apikey", "gedtf6ydpmfcnvguf4dwahn5");	
		conn.setRequestMethod("GET");
		System.out.println("TP 3 --------");
		
		System.out.println("TP 4 --------");
		//conn.addRequestProperty("username", "arpita.biswas07@gmail.com");
		//System.out.println("TP 5 --------");
		//conn.addRequestProperty("password", "pennapps2013");
		System.out.println("TP 6 --------");
		System.out.println("ghooochuuuu ---- 1");
		conn.connect();
		//InputStream in = conn.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String text = "";
		while((text = reader.readLine())!=null){
			//String text = reader.readLine();
			System.out.println(text);
		} // end of while 
		System.out.println("Done reading what hotwire sent");
		reader.close();
		}
		catch(Exception e){
			System.out.println("Something's crashed "+e);
		}
		System.out.println("Closed all");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
