import java.util.Calendar;
import java.util.Scanner;

public class PROMPT {
    private final static String PROMPT = ("calendar>");

    public static void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        calendarPractice cal = new calendarPractice();

        int month = 1;
        int year = 2020;

        while (true) {
            System.out.println("년도를 입력하세요");
            System.out.println("YEAR>");
            year = scanner.nextInt();
            System.out.println("달을 입력하세요");
            System.out.print("MONTH>");
            month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            cal.prints(year, month);


        }
        System.out.println("Bye~");
        scanner.close();

    }

    public static void main(String[] args) {
        PROMPT p = new PROMPT();
        p.runPrompt();
    }
}

