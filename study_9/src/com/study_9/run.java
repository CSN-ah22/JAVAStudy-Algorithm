package com.study_9;

public class run {
    public static void main(String[] args) {
        Tiger t_t = new Tiger();
        t_t.cry();

        Dog d_d = new Dog();
        d_d.cry();

        System.out.print("name : "+t_t.animal_name+"\s");
        System.out.println("name : "+d_d.animal_name);

    }
}
