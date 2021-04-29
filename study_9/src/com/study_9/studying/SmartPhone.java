package com.study_9.studying;

public class SmartPhone extends Phone {

    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다");
    }

    public static void main(String[] args) {
        SmartPhone s_s = new SmartPhone("홍길동");
        s_s.turnOn();
        s_s.turnOff();
        s_s.internetSearch();

        test2 t_t2 = new test2();
        test t_t1 = new test("test test");


    }

}

  class test {
    /*public void ddd(){
        System.out.println("test");
    }*/
    public test(String ss){

    }
}
 class test2 extends test{

    public test2(){
        super("brithny");
    }
    //ss 에는 brithny & test test 이 들어간다
 }
