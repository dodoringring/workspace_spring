package mvc.kh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer {

	public static void main(String[] args) throws IOException{
		StringBuilder sbURL = new StringBuilder("http://ws.bus.go.kr/api/rest/pathinfo/getLocationInfo");
		//sbURL.append("?ServiceKey="+URLEncoder.encode("9nuz%2FGKwmyIWRDfScPRiXA3QtDB7Syk1nDmh1T7%2BzUKRpxn9bfdSBT3JubexbPVo%2F5ohkKHmAis6ddOa%2BMYhww%3D%3D","UTF-8"));
		sbURL.append("?ServiceKey=9nuz%2FGKwmyIWRDfScPRiXA3QtDB7Syk1nDmh1T7%2BzUKRpxn9bfdSBT3JubexbPVo%2F5ohkKHmAis6ddOa%2BMYhww%3D%3D");
		sbURL.append("&stSrch="+URLEncoder.encode("광화문","UTF-8"));
		URL url = new URL(sbURL.toString());
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "text/xml");
		BufferedReader br;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));			
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}

}
