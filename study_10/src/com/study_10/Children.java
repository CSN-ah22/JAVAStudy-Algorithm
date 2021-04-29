package com.study_10;

public class Children extends Parent{

    @Override
    public void print() {
        System.out.println("Children : 오버라이딩시 재정의된 값만 출력됩니다");
    }
    public void test1(){
        System.out.println("Children : 캐스팅을 해야만 출력됩니다");
    }
}

class main{
    public static void main(String[] args) {
        Parent p_p = new Children();
        Children c_c = (Children) p_p;

        c_c.print(); //오버라이딩된 값 출력
        p_p.print(); //오버라이딩된 값 출력
        c_c.test1(); //부모가 자식의 메서드를 사용하려면 캐스팅이 필요
        p_p.test(); //Parent 타입이라 사용가능
        c_c.test(); //상속받아서 사용가능

    }
}
