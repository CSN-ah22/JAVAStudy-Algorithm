package com.study_12;

public class ExceptionTest {
    public void  call(int j){
        int [] i = {1,2,3};
        System.out.println("call value : "+i[j]);
    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.call(4);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("해당 문장은 무조건 실행됨");
        }
    }
}
