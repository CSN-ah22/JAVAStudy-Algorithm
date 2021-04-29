package com.study_6;

import java.util.Arrays;
import java.util.Scanner;

public class String_practice {
    static Scanner scanner = new Scanner(System.in);
    public void String_1(){
        String id;
        String password;
        System.out.print("아이디:");
        id = scanner.next();
        System.out.print("비밀번호:");
        password = scanner.next();
        System.out.print("id:");
        System.out.println(id.trim());
        System.out.print("password:");
        System.out.println(password.trim()+"\n");
    }

    public void String_2(){
        String s = "hello!";
        String arr_s = Arrays.toString(s.toCharArray());
        System.out.println(arr_s);
        System.out.print(arr_s.charAt(13));
        System.out.print(arr_s.charAt(16)+"\n\n");
    }

    public void String_3() {
        String s_s = "You are a Lucky duck";
        System.out.println("Lucky의 시작 위치:"+s_s.indexOf("Lucky")+"\n");
    }

    public void String_4(){
    String s2 = "고양이/강아지/코끼리/너구리";
    String []arr_s2;
     arr_s2  =   s2.split("/");
        for (int i=0; i<arr_s2.length; i++){
            System.out.println(arr_s2[i]);
        }
        System.out.print("\n");
    }

    public void String_5(){
        String s3 = "text.txt";
        System.out.println(s3.endsWith(".txt")+"\n");
    }

    public static void main(String[] args) {
        String_practice s_instance = new String_practice();
        System.out.println("1️⃣⚫➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
        s_instance.String_1();
        System.out.println("2️⃣⚫➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
        s_instance.String_2();
        System.out.println("3️⃣⚫➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
        s_instance.String_3();
        System.out.println("4️⃣⚫➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
        s_instance.String_4();
        System.out.println("5️⃣⚫➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
        s_instance.String_5();
    }
}
