import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.pl");
        HttpURLConnection con = (HttpURLConnection) url.openConnection(); //tworzymy polaczenie
        con.setRequestMethod("GET");

        int status = con.getResponseCode(); //pobiera status HTTP
        System.out.println(status);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(content);
    }
}
