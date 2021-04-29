package com.study_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String newUrls = "https://naver.com";
        String s="";
        URL url=null;
        try{
            url = new URL(newUrls);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line="";
            while ((line = reader.readLine()) !=null){
                if(!line.trim().equals("")){ //공백이 아니라면 + 문자열이라면
                    /*자를 문자열: <time datetime=\"2018-08-13\">August 13, 2018</time>"*/
                    if(line.trim().contains("<time datetime=")){
                        s=line.trim();
                        s=s.substring(0,s.indexOf(">")-1);
                        s=s.substring(s.indexOf("\"")+1).trim();
                        break;
                    }
                }
            }
        }catch (Exception e) {
            System.out.println("error!");
        }
        System.out.println("이번 빌보드 차트 날짜:"+s);
    }
}
