/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author sharmila
 */
public class Grabber {

    public Grabber() {
    }
    
    public static String grab(String link) throws IOException
    {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();

            String line = "";

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder builder=new StringBuilder();
            while((line=reader.readLine())!=null)
                    {
                        builder.append(line);
                        
                    }
            return builder.toString();
    }
}
