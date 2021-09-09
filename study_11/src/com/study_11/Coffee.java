package com.study_11;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Coffee {
     class Scanner {
         public void input(){
             System.out.println("구매하시겠습니까?: 1 or 0");
             java.util.Scanner scanner = new java.util.Scanner(System.in);
             String Order = scanner.next();
             if ("1".equals(Order)){
                 menu m = new menu();
                 m.menu_print();
             }
             else {
                 System.out.println("취소되었습니다");
             }
         }
    }
    static class menu{
            public void menu_print(){
                System.out.println("----주문번호----");
                System.out.println("Americano-03");
                System.out.println("Cafe Latte-04");
                System.out.println("Milk Blend-05");
                System.out.println("결제가 완료되었습니다");
            }
    }
}
class run{
    public static void main(String[] args) {
        Coffee cof = new Coffee();
        Coffee.Scanner in = cof.new Scanner();
        in.input();
    }
}
