package com.www;

//서연이 문제(*￣3￣)╭
public class Dog {
    public static void run(){
        System.out.println("멍멍");
    }
    public static void run(int age){
        System.out.println("강아지 나이는"+age+"살 입니다");
    }
    public static void run(String name,int age){
        System.out.println("강아지 이름은"+name+"이고 나이는"+age+"살 입니다");
    }

    public static void main(String[] args) {
        run();
        run(7);
        run("바둑이",5);
    }
}
