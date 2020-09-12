import java.util.Calendar;
import java.util.Scanner;

public class calendarPractice {
    private static int[] mmd = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};

    public static int maxDays(int month) {
        return mmd[month - 1];
    }

    public static void prints() {
        System.out.println(
                "\n2020.09\n" +
                        "일	월	화	수	목	금	토\n" +
                        "30	31	1	2	3	4	5\n" +
                        "6	7	8	9	10	11	12\n" +
                        "13	14	15	16	17	18	19\n" +
                        "20	21	22	23	24	25	26\n" +
                        "27	28	29	30	 1	 2	 3\n");

    }

    public static void main(String[] args) {
        String PROMPT = "calendar> ";
        Scanner scanner = new Scanner(System.in);


        int month = 1;
        while (true) {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            System.out.printf("%d월은%d일까지있습니다\n\n", month, maxDays(month));
        }
        System.out.println("Bye~");
        scanner.close();

    }
}
