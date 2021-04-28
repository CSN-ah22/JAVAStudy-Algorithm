package com.company;

import java.util.Scanner;

public class Main { //배열 문제1

    public static void main(String[] args) {
        int N;
        int []A ;
        int value;

        System.out.print("비교할 정수 개수:");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        System.out.println("\n비교할 정수:");
        for (int i = 0; i<N; i++){
            System.out.print(">");
            value = scanner.nextInt();
            A [i] = value;



        }
        /*
        int i =0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (A[i] < A[j]) {
                        small = A[i];
                    } else {
                        small = A[j];
                        i  = j;
                    }
                }

           }
           */
        int small=A[0];
        for (int j = 0; j < N; j++) {
            if (small>=A[j]){
                small = A[j];
            }
        }System.out.println("최소값:" + small);

        }




    }

