package com.company;

import java.util.Scanner;

public class www { //2차시 숙제
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("============swhitch==========");
        sw_ch();
        System.out.println("============while============");
        wh_le();
        System.out.println("===========do_while==========");
        do_w();
        System.out.println("============for==============");
        f_r();
        System.out.println("==============end============");

    }

    public static void do_w() {
        int num = 1;
        do {
            System.out.print("1과 100 사이 수를 입력하세요(0을 넣으면 종료):");
            num = scanner.nextInt();

            if (num==0){
                break;
            }

            if (num % 2 == 0) {
                System.out.println("짝수입니다");
            } else {
                System.out.println("홀수 입니다");
            }
        } while (num != 0);
    }

    public static void f_r() {
        int sub = 0;
        for (int i = 0; i <= 1000; i=i+7) {
                sub = sub + i;
        }
        System.out.println("7의 배수 합:" + sub);
    }

    public static void wh_le() {
        int total = 0;
        for (int i = 0; i <= 101; i++) {
            if (i % 2 == 0&&i % 3 == 0&&i % 5 == 0) {
                total = total + i;
            }
        }
        System.out.println("2,3,5의 공배수:" + total);
    }

    public static void sw_ch() {
        int week = 4;
        switch (week){
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
        }
    }
}


