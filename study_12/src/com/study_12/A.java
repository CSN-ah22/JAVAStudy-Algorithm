package com.study_12;

import java.util.Scanner;

public class A {
    public static void square (String s)throws NumberFormatException{
        int n;
        n = Integer.parseInt(s);
        System.out.println(n*n);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해라 : ");
        String s = scanner.next();
        try {
            square(s);
        }catch (NumberFormatException e){
            System.out.println("정수가 아닙니다");
        }
    }
}
