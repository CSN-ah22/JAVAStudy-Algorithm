package com.study_4;

import java.util.Scanner;

public class class_2 {
    public static  void class_2(){
        int value1 ;
        int value2 ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1>입력:");
        value1 = scanner.nextInt();
        System.out.print("2>입력:");
        value2 = scanner.nextInt();

        if (value1>value2){
            value1 = value1/2;
            value2 =value2*2;
        }
        else {
            value2 = value2/2;
            value1 = value1*2;
        }
        System.out.print(value1+" "+value2);
    }
}
