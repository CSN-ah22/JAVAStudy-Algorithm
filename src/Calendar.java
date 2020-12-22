import java.util.Arrays;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("반복횟수를 입력해주세요:");
        int count = scanner.nextInt();
        int[] result = new int[count]; //반복횟수만큼 배열 생성
        System.out.println("1.마지막 날짜를 알고싶은 달을 입력해주세요\n2.0이하의 숫자를 넣으면 종료됩니다:");

        //main함수에서 반복횟수를 입력받고 그만큼 생성한 배열에 month를 입력받아 넣는다
        int month = 1;
        int i = 0;
        while (i < result.length) {
            System.out.print(">");
            month = scanner.nextInt();
            if (month > 0) {  //0이하를 넣으면 종료될 수 있게 비교문을 넣었다
                result[i] = month; /*날짜를 출력하는 메서드~ i가 0부터 시작하여 반복횟수까지 배열의 인덱스를 지정해준다*/
//                System.out.println(result[i] + "월은" + days[result[i]] + "일까지 있습니다");
                System.out.println("일 월 화 수 목 금 토");
                System.out.println("------------------");
                for (int j = 1; j <= days[result[i]]; j++) {

                    if ((j % 7) == 0) {
                        System.out.println(j + "");
                    } else if ((j % days[result[i]]) == 0) {
                        System.out.println("");
                    } else if (j >= 10) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(j + "  ");
                    }
                }
            } else {
                System.out.println("종료~!");
                break;
            }
        }


    }
}