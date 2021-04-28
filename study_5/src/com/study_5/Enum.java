package com.study_5;

public class Enum {
    public enum Currency {
        DOLLLAR, EURO, YEN, YUAN;


    }

    public static void main(String[] args) {
        Currency curCurrency = Currency.DOLLLAR;
        String s = Currency.DOLLLAR.toString();

        if (Currency.DOLLLAR==curCurrency){
            System.out.println("달러입니다");
            System.out.println(Currency.DOLLLAR);
        }
        else {
            System.out.println("같지 않습니다");
        }
    }
}
