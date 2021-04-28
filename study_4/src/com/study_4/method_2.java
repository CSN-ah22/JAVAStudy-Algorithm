package com.study_4;

import java.util.Scanner;

public class method_2 {
    public static double f(){
        double t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("실수를 입력해주세요:");
        t = scanner.nextDouble();
        return t-(int)t;
    }

    public static void main(String[] args) {
        double d;
        d = f();
        System.out.println(d);
    }
}
