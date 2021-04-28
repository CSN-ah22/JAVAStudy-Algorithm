package com.study_4;

public class Stu_Exam {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.no = 202030430;
        stu.name = "최선아";
        stu.phone_num = "010-2676-4550";

        System.out.println("학번 :"+stu.no);
        System.out.println("이름 :"+stu.name);
        System.out.println("핸드폰 번호 :"+ stu.phone_num);

        System.out.println("===============================");
        student_메서드선언();
    }
    public static void student_메서드선언(){
        Student stu = new Student();
        stu.no = 202030430;
        stu.name = "최선아";
        stu.phone_num = "010-2676-4550";

        System.out.println("학번 :"+stu.no);
        System.out.println("이름 :"+stu.name);
        System.out.println("핸드폰 번호 :"+stu.phone_num);

        int score1 = 90;
        int score2 = 85;

        System.out.println("전공1 :"+score1);
        System.out.println("전공2 :"+score2);

        System.out.println("점수 합산");
        System.out.println("전공 점수 합 :"+(score1+score2));
    }

}
