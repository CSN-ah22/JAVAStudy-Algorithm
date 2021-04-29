package com.study_9;

public class Tiger extends Animal{

    public Tiger(){
        super("호랑이");
    }

    @Override
    public void cry() {
        System.out.print("어흥어흥 ");
    }
}
