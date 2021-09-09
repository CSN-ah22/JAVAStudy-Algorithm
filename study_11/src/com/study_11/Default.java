package com.study_11;

public interface Default {
    public default void setState(boolean state){
        if (state){
            System.out.println("현재 상태는 정상입니다");
        }else{
            System.out.println("현재 상태는 비정상입니다");
        }
    }
}
