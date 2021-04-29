package com.study_14;

public class change_2Binary {
    public static String shifts(int a){
        //10진수 정수를 2진수로 출력
        String s = "";
        for (int i=0; i<=4;i++){//이 반복문은 4bit 까지만 표현되게 해줍니다
            int bit = a%2;
            s=(bit>=0)? bit+s : (-bit)+s; //양수 or 음수인지 확인 => 문자열
            a>>=1; //한 자리 쉬프트 ex) a의 초기값이 9라면 몫인 4, 2, 1을 담음
            System.out.print(bit+"\t");
        }
    return s;
    }
    public static void main(String[] args){
        int number1 = 9;
        int number2 = 4;
        int number3 = 2;
        System.out.printf("|%d:%s%n",number1,shifts(number1));
        System.out.printf("|%d:%s%n",number2,shifts(number2));
        System.out.printf("|%d:%s%n",number3,shifts(number3));

    }
}
