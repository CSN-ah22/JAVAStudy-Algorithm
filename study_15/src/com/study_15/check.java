package com.study_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class check {
    public static void main(String[] args) {
        String newUrls = "file:///C:/Users/csa26/OneDrive/%EB%B0%94%ED%83%95%20%ED%99%94%EB%A9%B4/time.html";
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
            String document = "<time datetime=\"2018-08-13\">August 13, 2018</time>";
            String word = "\"";

            System.out.println(findIndexes(word, document));
            System.out.println(document.substring(0,15));
        }catch (Exception e) {
            System.out.println("error!");
        }
        System.out.println("이번 빌보드 차트 날짜:"+s);
    }
    public static List<Integer> findIndexes(String word, String document) {
        List<Integer> indexList = new ArrayList<Integer>();
        int index = document.indexOf(word);

        while(index != -1) {
            indexList.add(index);
            index = document.indexOf(word, index+word.length());
        }

        return indexList;
    }
}
