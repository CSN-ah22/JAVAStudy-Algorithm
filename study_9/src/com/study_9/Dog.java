package com.study_9;

public class Dog extends Animal  {
    public Dog(){
        super("강아지");
    }

    @Override
    public void cry() {
        System.out.println(" 멍멍멍");
    }
}
