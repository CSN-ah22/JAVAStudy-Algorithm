package com.study_8;

import java.util.Scanner;

public class Student extends Teacher {
    public static void main(String[] args) {
        Student stu = new Student(); //객체 생성
        stu.print();
    }
    public void print(){
        String name_arr[];

        name_arr = new String[]{student_1, student_2,student_3,student_4,student_5,student_6};


        System.out.print("이름을 입력해 주세요:");
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.next();

        int escape = 0;


        for (int i = 0; i<name_arr.length; i++) {
            if (input_name.equals(name_arr[i])){
                escape = 1;
                System.out.println("당신의 반: "+c_group);
                System.out.println("당신의 자리: "+(i+1));
                System.out.println("담임 선생님: 박도현");
            }
            else {

            }
        }

        if (escape == 0){
            System.out.println("당신은 우리 반이 아닙니다");
        }
    }

}
