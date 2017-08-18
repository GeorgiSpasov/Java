/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Georgi Spasov
 */
public class SiteMonitor {

    private final String USER_AGENT = "Mozilla/5.0";

    public String sendGet() throws Exception {
        String data = "";

        String url = "http://data.vivacom.bg/";
        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        connection.setRequestMethod("GET");

        //add request header
        connection.setRequestProperty("User-Agent", USER_AGENT);

//        int responseCode = connection.getResponseCode(); // 200 = success
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " + responseCode);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;

        Pattern pattern = Pattern.compile(".*<div id=\"percentage\">(.*?)</div>.*");
        Matcher matcher;
        while ((inputLine = reader.readLine()) != null) {
            matcher = pattern.matcher(inputLine);

            if (matcher.find()) {
                data = matcher.group(1);
                reader.close();
                break;
            }
        }
        return data;
    }
}
