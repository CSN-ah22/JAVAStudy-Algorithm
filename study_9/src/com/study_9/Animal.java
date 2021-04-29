package com.study_9;

public abstract class Animal {
    String animal_name;
// ▼생성자
   public Animal(String name){
       this.animal_name = name;
   }
//  ▼추상메서드
    public abstract void cry();
}
