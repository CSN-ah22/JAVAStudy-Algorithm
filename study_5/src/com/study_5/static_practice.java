package com.study_5;

import java.util.Scanner;

public class static_practice {
    static int total;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력>");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = sum + num;
            if (num > 0) {
                total = total + num;
            }
            System.out.print("입력>");
            num = scanner.nextInt();
        }
        System.out.println("양의 정수 누적 값 : " + total);
        System.out.println("입력값의 누적 값:" + sum);
        System.out.println("종료");

    }
}
