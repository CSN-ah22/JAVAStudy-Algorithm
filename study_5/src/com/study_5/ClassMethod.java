package com.study_5;

public class ClassMethod {
    //교수님 문제
    int gCount =0;
    static int sCount = 10;
    static void myStaticMetchod(){
        sCount++;
        System.out.println("myStaticMethod 에서 scount="+sCount);

    }
    public void  myPublicMethod(){
        sCount = 20;
        gCount++;

        System.out.println("myPublicMethod 에서 gcount="+gCount);
        System.out.println("myPublicMethod 에서 scount="+sCount);


    }
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "hello";
        if (s1.compareToIgnoreCase(s2)==0){
            System.out.println("같은 문자열 입니다");
        }
        else {

        }
        System.out.println("======================");
        ClassMethod myobj = new ClassMethod();

        myStaticMetchod();
        myobj.myPublicMethod();

        System.out.println("main 에서 gcount ="+myobj.gCount );
        System.out.println("main 에서 myObj.scount ="+sCount );


    }


}
