package Weather;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPWeather {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("User-Agent", "Mozilla/5.0");

        int status = con.getResponseCode();
        System.out.println(status);

        String response = readResponse(con);
        Gson gson = new Gson();
        WeatherAPI weather = gson.fromJson(response, WeatherAPI.class);
        System.out.println("Deserialize: ");
        System.out.println(weather);
        con.disconnect();
    }

    private static String readResponse(HttpURLConnection con) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader((InputStream) con.getContent()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(content);
        return content.toString();
    }
}
