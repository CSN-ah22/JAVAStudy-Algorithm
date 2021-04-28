package com.study_4;

public class method_4 {
    public static void main(String[] args) {
        score(50,80, 100.0);
        score(96,88,66);
        score(100,85.0,90);
    }
    public static void score(int a, int b,double i){
        int sum;
        sum =(int) (a+b+i);
        System.out.println(a+" "+b+" "+i+" "+sum);
    }
    public static void score(int c, int d, int h){
        int sum;
        sum = c+d+h;
        System.out.println(c+" "+d+" "+h+" "+" "+sum);
    }
    public static void score(int e, double f ,int g){
        int sum;
        sum =(int) (e+f+g);
        System.out.println(e+" "+f+" "+g+" "+" "+sum);
    }
}
