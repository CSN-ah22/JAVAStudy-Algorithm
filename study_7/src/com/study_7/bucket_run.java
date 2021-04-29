package com.study_7;


public class bucket_run {
    public static void main(String[] args) {

        bucket list = new bucket(1, "영어 공부 하기");
        bucket list1 = new bucket();

        String showlist = bucket_list(list.num, list.s_s);
        bucket_list(list.num);
        bucket_list(showlist);

    }

    public static String bucket_list(int num, String s_s) {
        String arrlist[] = new String[100];
        arrlist[num] = s_s;
        return arrlist[num];
    }

    public static void bucket_list(int num) {
        System.out.println(num + "번에 추가 되었습니다");
    }

    public static void bucket_list(String showlist) {
        System.out.println(showlist);
    }

}
