package com.study_4;

public class Main {
    public static void for_each문제() {
        int iarr[] = {10, 20, 30, 40, 50};

        for (int d : iarr) {
            System.out.println(d);
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] * iarr[i]);
        }
        System.out.println("For each문");
        for (int i : iarr) {
            System.out.println(i * i);
        }

    }

    public static void class_참조문제() {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";
        String str4 = "hello";

        if (str1 == str2) {
            System.out.println("str1과 str2는 같은 래퍼런스 입니다");
        } else {
            System.out.println("str1과 str2는 다른 래퍼런스 입니다");
        }
        if (str3 == str4) {
            System.out.println("str3과 str4는 같은 래퍼런스 입니다");
        } else {
            System.out.println("str3과 str4는 다른 래퍼런스 입니다");
        }
        str1 = "look";
        System.out.println("str1은" + str1);
        System.out.println("str2는" + str2);
        if (str1 != str2) {
            System.out.println("str1과 str2는 다른 래퍼런스 입니다");
        } else {
            System.out.println("str1과 str2는 같은 래퍼런스 입니다");
        }
    }

    public static void main(String[] args) {
        for_each문제();
        System.out.println("================================");
        class_참조문제();
    }
}
