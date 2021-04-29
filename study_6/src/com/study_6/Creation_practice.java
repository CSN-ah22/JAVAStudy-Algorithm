package com.study_6;

public class Creation_practice {
    String school_name;
    int grade;

    public Creation_practice(){
        school_name = "Jejuelementary";
        grade = 6;
        System.out.println(grade+" grade in "+school_name+" school");
    }
    public Creation_practice(String school_name,int grade){
        this.school_name = school_name;
        this.grade = grade;
        System.out.println(grade+" grade in "+school_name+" school");
    }
    public static void main(String[] args) {
        Creation_practice c_c = new Creation_practice();
        Creation_practice c_c2 = new Creation_practice("Seogwipomiddle",1);

    }
}

