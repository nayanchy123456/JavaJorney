package question2;

import java.io.DataInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnection {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET, POST, etc.)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Use DataInputStream to read the response content
            DataInputStream dis = new DataInputStream(connection.getInputStream());

            // Read the response content
            byte[] buffer = new byte[4096];
            int bytesRead;
            StringBuilder responseContent = new StringBuilder();
            while ((bytesRead = dis.read(buffer)) != -1) {
                responseContent.append(new String(buffer, 0, bytesRead));
            }

            // Print the response content
            System.out.println("Response Content:\n" + responseContent.toString());

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
