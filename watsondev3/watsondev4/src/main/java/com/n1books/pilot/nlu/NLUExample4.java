package com.n1books.pilot.nlu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.StringEscapeUtils;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonParser;

public class NLUExample4 {
	public static void main(String[] args) throws Exception {
		  URL url = new URL("https://httpbin.org/anything");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	      JSONParser json = new JSONParser();
	      JsonParser gson = new JsonParser();
	      StringBuilder sb = new StringBuilder();
	      
	      if (conn.getResponseCode() == 200) {
	         BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	         String line = null;

	         while ((line = br.readLine()) != null) {
	            sb.append(line);
	         }
	      }

	      System.out.println(StringEscapeUtils.unescapeJson(json.parse(sb.toString()).toString()));
	      System.out.println(gson.parse(sb.toString()));
	}
}
