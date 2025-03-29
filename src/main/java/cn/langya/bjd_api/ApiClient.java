package cn.langya.bjd_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 * @author LangYa466
 * @since 3/29/2025
 */
public class ApiClient {
    private final String apiUrl;
    private final String secretKey;

    public ApiClient(String apiUrl, String secretKey) {
        this.apiUrl = apiUrl;
        this.secretKey = secretKey;
    }

    public ApiClient(String secretKey) {
        this.apiUrl = "http://api.bjd-mc.com:8080";
        this.secretKey = secretKey;
    }

    public String post(String endpoint, String jsonBody) throws Exception {
        URL url = new URL(apiUrl + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString((secretKey + ":").getBytes()));
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(jsonBody.getBytes());
            os.flush();
        }

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new Exception("API request failed with status code: " + responseCode);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } finally {
            conn.disconnect();
        }
    }
}