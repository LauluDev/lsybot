import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.lang.*;

public class URLGetter {
	
	private final String USER_AGENT = "LauluDev";
	
	public String imgURLFetch(int epNum) throws Exception {
		String url = "http://sports.donga.com/Cartoon?cid=0100000204&sid="+epNum;

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to url : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String inputLine;
		StringBuffer response = new StringBuffer();

		while((inputLine = in.readLine()) != null) {
			//response.append(inputLine+"\n");
			if(inputLine.indexOf("<a href='http://dimg.donga.com") !=-1) {
				int ssindex = inputLine.indexOf("'><img");
				return inputLine.substring(9,ssindex);
			}
			if(inputLine.indexOf("<a href='http://image.donga.com") !=-1) {
				int ssindex = inputLine.indexOf("'><img");
				return inputLine.substring(9,ssindex);
			}
		}
		in.close();
		return "NOURLFOUND";
	}
}
