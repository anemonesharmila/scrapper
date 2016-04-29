/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sharmila
 */
public class CSVReader {
    
    public static List<String> getUrls(String filePath) throws IOException
    {
        List<String> urlList=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new FileReader(filePath));
        String line="";
        while((line=reader.readLine())!=null)
        {
            urlList.add(line);
            
        }
        return urlList;
    }
}
