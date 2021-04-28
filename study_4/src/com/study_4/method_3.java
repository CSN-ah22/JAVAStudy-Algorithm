package com.study_4;

public class method_3 {
    public static void main(String[] args) {
        Square(8,10);
    }
    public static void Square (int a, int b){
    int c;
        if (a>b){
          c = (a*a) - b*b;
        }
        else {
            c = (b*b) - a*a;
        }
        System.out.println(c);
    }
}
