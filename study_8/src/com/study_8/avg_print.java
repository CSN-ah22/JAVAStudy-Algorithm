package com.study_8;

import java.util.Scanner;

public class avg_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        avg_make m = new avg_make(); //객체생성

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "> " + "더 할 값을 입력해주세요: ");
            int x = scanner.nextInt();
            m.set(x);
        }
        double avg = m.get();
        System.out.println("평균= " + avg);


    }
}
