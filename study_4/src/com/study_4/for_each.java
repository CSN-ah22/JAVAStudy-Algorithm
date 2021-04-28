package com.study_4;

public class for_each {
    public static void main(String[] args) {
        String week[] = new String[]{"월","화","수","목","금","토","일"};

        for (String day:week) {
            System.out.println(day+"요일");
        }
    }
}
