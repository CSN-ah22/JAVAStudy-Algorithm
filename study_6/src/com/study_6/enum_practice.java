package com.study_6;

public class enum_practice {
    /*  𝓔𝓝𝓤𝓜  */
    public enum Fruit {
        APPLE(0), ORANGE(1), STRAWBERRY(2), BANANA(3), LEMON(4), GRAPE_FRUIT(5);

        Fruit(int i) {

        }
    }
    /*  𝓔𝓝𝓤𝓜  */


    /* T/F 구분 메서드 */
    public void pick() {
        String s1 = "BANANA";
        int i = 0;
        for (Fruit f : Fruit.values()) {
            if (f.toString() == s1) {
                i = 1;
                if (i == 1) {
                    System.out.println("값이 있습니다🟡🟡!!");
                }
            } else {

            }
        }
        if (i == 0) {
            System.out.println("값이 없습니다 ❌❌!!");
        }

    }
    /* T/F 구분 메서드 */

    /*  ╲╲╲╲╲╲╲╲╲╲╲╲ */
    public static void main(String[] args) {
        enum_practice ee = new enum_practice();
        ee.pick();
    }
}
