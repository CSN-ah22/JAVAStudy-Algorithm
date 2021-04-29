package com.www;

import com.Pakage_practice.Study;

//서연이 문제2╰(*°▽°*)╯
public class Student {
    String subject;
    int score;

    public Student(){
        this("없음",0);
    }
    public Student(String s_s){
        this(s_s,0);
    }
    public Student(String s_s,int j_j){
        this.score = j_j;
        this.subject = s_s;
    }

    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("수학");
        Student stu2 = new Student("국어",100);

        System.out.println(stu.subject+stu.score);
        System.out.println(stu1.subject+stu1.score);
        System.out.println(stu2.subject+stu2.score);
    }

}
