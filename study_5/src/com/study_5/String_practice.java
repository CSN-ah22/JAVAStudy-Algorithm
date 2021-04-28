package com.study_5;

import java.util.Scanner;

public class String_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5자 이상 입력하세요: ");
        String s = scanner.next();

        System.out.println(s.substring(0,5));
    }
}
