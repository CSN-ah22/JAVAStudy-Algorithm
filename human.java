package Practice;

import java.util.Scanner;

public class human implements Animal {
    public enum language{
        kor(0), eng(1),jap(2);

        language(int i) {
        }
    }

    @Override
    public void animalSound() {

    }

    @Override
    public void sleep() {

    }
    public void human(){
        System.out.println("사람의 언어를 입력해주세요(0~2):  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

            language ll =language.values()[num];
            System.out.println(ll.toString());


    }
    public void humanSleep(){
        double rd = Math.random();
        int random = (int) (rd*3);
        System.out.println("random 값: "+random);
        language landomll = language.values()[random];
        System.out.println(landomll.toString());

    }

    public static void main(String[] args) {
        pig p_p = new pig();
        p_p.animalSound();
        p_p.sleep();
        human h_h = new human();
        h_h.human();
        h_h.humanSleep();
    }


}
