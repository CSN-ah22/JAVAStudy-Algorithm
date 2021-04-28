package com.company;

import java.io.OptionalDataException;
import java.util.Scanner;

public class study_3_2 {
    public static void main(String[] args) { //배열문제 2

        int count;
        int array[] = new int[3];
        int array_value[] = new int[3]; //저장용 배열


        Scanner scanner = new Scanner(System.in);

        System.out.println("배열에 넣을 3개 값을 입력하세요:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(">");
            count = scanner.nextInt();
            array[i] = count;
        }

        if (array[0] > array[1]) {             //[0]>[1 or 2]>[1 or 2]
            array_value[0] = array[0];
            if (array[1] > array[2]) {         //[0]>[1]>[2]
                array_value[1] = array[1];
                array_value[2] = array[2];
            } else {                           //[0]>[1]>[2]
                array_value[1] = array[2];
                array_value[2] = array[1];
            }

        } else {
            if (array[1] > array[2]) {         //[1]>[2 or 0]>[2 or 0]
                array_value[0] = array[1];     //[1]값을 저장 배열의[0]번으로

                if (array[0] > array[2]) {     // [1]>[0]>[2]
                    array_value[1] = array[0];
                    array_value[2] = array[2];
                } else {                       // [1]>[2]>[0]
                    array_value[1] = array[2];
                    array_value[2] = array[0];
                }
            } else {                           // [2]>[1]>[0]
                array_value[0] = array[2];
                array_value[1] = array[1];
                array_value[2] = array[0];
            }

        }
        for (int h = 0; h < array.length; h++) {
            System.out.print(array_value[h] + " ");
        }
    }

}



