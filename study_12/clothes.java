package com.study_12;

import java.util.Scanner;

public class clothes {
    int T_shirts;
    int i = 1;
    int j = 1;
    int k = 1;

    public int count(String size) throws Exception {

        if (size.equals("XL")) {
            this.T_shirts = 7 - i; //입력시 하나 빼기
            i++; //증가
            /* 𝓣𝓱𝓻𝓸𝔀 */
            if (T_shirts <= 0) {
                throw new Exception("품절");
            }
            /* 𝓣𝓱𝓻𝓸𝔀 */
            return T_shirts;

        } else if (size.equals("M")) {
            this.T_shirts = 4 - j;
            j++;
            /* 𝓣𝓱𝓻𝓸𝔀 */
            if (T_shirts <= 0) {
                throw new Exception("품절");
            }
            /* 𝓣𝓱𝓻𝓸𝔀 */
            return T_shirts;
        } else if (size.equals("S")) {
            this.T_shirts = 2 - k;
            k++;
            /* 𝓣𝓱𝓻𝓸𝔀 */
            if (T_shirts <= 0) {
                throw new Exception("품절");
            }
            /* 𝓣𝓱𝓻𝓸𝔀 */
            return T_shirts;
        } else {
            throw new Exception("해당 사이즈는 판매하지 않습니다");
        }
    }

}

class run {
    public static void main(String[] args) {
        clothes c_c = new clothes();
        for (int c = 1; c <= 13; c++) {
            try {

                System.out.println("구입할 사이즈를 입력해주세요: ");
                Scanner scanner = new Scanner(System.in);
                String request = scanner.next();
                int T_count = c_c.count(request);
                System.out.println(T_count);


            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }
}
