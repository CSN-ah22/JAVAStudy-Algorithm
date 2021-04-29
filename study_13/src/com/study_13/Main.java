package com.study_13;

public class Main {
    public static boolean isPrime(int n){
        boolean isS = true;
        for (int i =2 ; i<=(int)Math.sqrt(n); i++){
            if (n%i==0){
                isS = false;
                break;
            }
        }
        return isS;
    }


    public static void main(String[] args) {
	int number = 1234567;
	boolean ifPrime;
	ifPrime = isPrime(number);
	if (ifPrime==false){
        System.out.println("소수가 아닙니다");
    }else {
        System.out.println("소수입니다");
    }
    }
}
