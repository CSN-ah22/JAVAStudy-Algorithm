package com.study_14;

public class currency {
    public static double toMoney(String c){
        double tot=0.0;
        switch (c){//switch 에서 할 수 있는거: int,char,string,enum
            case "USD": tot = 1126.5;
            break;
            case "JPY": tot = 110.6;
            break;
            case "CNY": tot = 10.5;
            break;
            default: tot = 1;
            break;
        }
        return tot;
    }

    public static void main(String[] args) {
        String money = "USD";
        double result = toMoney(money);
        System.out.printf("%s=>%f\n",money,result); //%s는 문자열 %f는 소수
    }
}
