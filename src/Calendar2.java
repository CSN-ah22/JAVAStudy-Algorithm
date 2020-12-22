import java.util.Arrays;
import java.util.Scanner;

public class Calendar2 {

    public static int[] input(int[] result) { //main함수에서 반복횟수를 입력받고 그만큼 생성한 배열에 month를 입력받아 넣는다
        Scanner scanner = new Scanner(System.in);
        int month = 1;
        int i = 0;
        while (i < result.length) {
            System.out.print(">");
            month = scanner.nextInt();
            if (month > -1) {  //0이하를 넣으면 종료될 수 있게 비교문을 넣었다
                result[i] = month;
                i++;
            } else {
                System.out.println("종료~!");
                break;
            }
        }
        return result;
    }

    public static void print(int count, int[] result) {
        /*날짜를 출력하는 메서드~ j가 0부터 시작하여 반복횟수까지 배열의 인덱스를 지정해준다*/
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int j = 0; j < count; j++) {
            if (result[j] > 0) {
                System.out.println(result[j] + "월은" + days[result[j]] + "일까지 있습니다");

            } else {
                int idx0 = Arrays.binarySearch(result, 0);
                System.out.println("0이 들어있는 배열의 인덱스번호는:" + idx0); //배열이니까 0번부터 셈
                break;

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("반복횟수를 입력해주세요:");
        int count = scanner.nextInt();
        int[] result = new int[count]; //반복횟수만큼 배열 생성
        System.out.println("1.마지막 날짜를 알고싶은 달을 입력해주세요\n2.0 숫자를 넣으면 종료됩니다:");

        Calendar2.input(result);
        Calendar2.print(count, result);

    }
}


