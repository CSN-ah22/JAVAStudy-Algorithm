package com.company;

import java.util.Arrays;
import java.util.Collections;

public class practice { //스터디 실습
    public static void main(String[] args) {
        int []a = {10,20,30,40,50};

        for (int i=0; i<a.length; i++ ){
            for (int j=i+1; j<a.length; j=j+1){
                if (a[i] < a[j]){
                    int temp;
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        Integer arr[] = {2,43,22,9,10,45,7};
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i : arr) {
            System.out.println("["+i+"]");
        }
    }
}
