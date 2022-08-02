package com.flipkart.api.seller.client.access_token_generation;

import com.flipkart.api.seller.client.UrlConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

public class AccessTokenGenerator {

  private static  String clientId = "";
  private static  String clientSecret = "";
  private static  String auth = "";
  private static  String authentication = "";

  public void clientCredentials(String id, String secret) {
    this.clientId = id;
    this.clientSecret = secret;
    this.auth = clientId + ":" + clientSecret;
    authentication = Base64.getEncoder().encodeToString(auth.getBytes());
  }


  private static final Pattern pat = Pattern.compile(".*\"access_token\"\\s*:\\s*\"([^\"]+)\".*");
  private static final String tokenUrl = UrlConfiguration.getAccessToken();

  public static String getClientCredentialsAccessToken() {
    BufferedReader reader = null;
    HttpsURLConnection connection = null;
    String returnValue = "";
    String urlWithScope = UrlConfiguration.getAccessToken();
    try {
      URL url = new URL(urlWithScope);
      connection = (HttpsURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setDoOutput(true);
      connection.setRequestProperty("Authorization", "Basic " + authentication);
      connection.setRequestProperty("Accept", "application/json");
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line = null;
      StringWriter out = new StringWriter(connection.getContentLength() > 0 ? connection.getContentLength() : 2048);
      while ((line = reader.readLine()) != null) {
        out.append(line);
      }
      String response = out.toString();
      Matcher matcher = pat.matcher(response);
      if (matcher.matches() && matcher.groupCount() > 0) {
        returnValue = matcher.group(1);
      }
    } catch (Exception e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
        }
      }
      connection.disconnect();
    }
    return returnValue;
  }

}