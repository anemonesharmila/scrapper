/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scrapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sharmila
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        try {

         //-----------------for reading from file
        // Grabber crawler = new Grabber();
//            for (String s : CSVReader.getUrls("E:/java class/links.csv")) {
//                System.out.println(crawler.grab(s));
//               
//            }
//             System.out.println("---------------");
        //reading from web site
//            String content=crawler.grab("http://jobsnepal.com");
//            String regex="<a class=\"job-item\" id=\"(.*?)\" href=\"(.*?)\"(.*?) >(.*?)" + "(.*?)</a>(.*?)" ;
//            String regex1="<a href=\"(.*?)\" class=\"joblist\">(.*?)" +"(.*?)" +"(.*?)</a>";
//            Pattern pattern=Pattern.compile(regex);
//            Pattern p=Pattern.compile(regex1);
//            Matcher matcher=pattern.matcher(content );
//            Matcher match=p.matcher(content);
//            
//            
//            System.out.println("Enter the url to scrap \n");
//            Scanner scanner = new Scanner(System.in);
//            String content = Grabber.grab(scanner.nextLine());
//            //connect to the url
//            
//            String Regex = "graphics/model/(.*?)/thumb/(.*?).jpg";
//            Pattern pattern = Pattern.compile(Regex);
//            Matcher matcher = pattern.matcher(content);
//
//            while (matcher.find()) {
//                String imageRegex = "http://cybersansar.com/" + matcher.group(0).replace("/thumb", "");
//                System.out.println(imageRegex);
//                URLConnection con = new URL(imageRegex).openConnection();
//                InputStream in = con.getInputStream();
//                String[] data = imageRegex.split("/");
//                FileOutputStream out = new FileOutputStream(data[data.length-1]);
//
//                byte[] byt = new byte[1024];
//                int i = 0;
//
//                while ((i = in.read(byt)) != -1) {
//                    out.write(byt, 0, i);
//                }
//
//                
//                out.close();
//                in.close();
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//    }
        System.out.println("Enter the url \n");
        Scanner input = new Scanner(System.in);
        String content = Grabber.grab(input.nextLine());

        String regex = "/image/cache/catalog/Flower/(.*?).jpg";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            String imagepath = "http://kathmandumart.com" + matcher.group(0);

            System.out.println(imagepath);
            
            URLConnection conn=new  URL(imagepath).openConnection();
            InputStream in=conn.getInputStream();
            String[] imageData=imagepath.split("/");
            FileOutputStream out=new FileOutputStream(imageData[imageData.length-1]);
            
            
        }

    }
}
