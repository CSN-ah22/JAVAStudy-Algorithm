import java.util.Scanner;

public class PROMPT {
//     week 요일명
//     return 0 ~ 6 (0 =Sunday, 6 = Saturday)
    public int parseDay(String week) {
        if      (week.equals ("su")) { return 0; }
        else if (week.equals ("mo")) { return 1; }
        else if (week.equals ("tu")) { return 2; }
        else if (week.equals ("wd")) { return 3; }
        else if (week.equals ("th")) { return 4; }
        else if (week.equals ("fr")) { return 5; }
        else if (week.equals ("sa")) { return 6; }
            return 0;
    }

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        calendarPractice cal = new calendarPractice();

        int month ;
        int year ;
        int weekday ;

        while (true) {
            System.out.println("년도를 입력하세요 (exit: -1");
            System.out.print("YEAR>");
            year = scanner.nextInt();
            if( year == -1)
                break;

            System.out.println("달을 입력하세요");
            System.out.print("MONTH>");
            month = scanner.nextInt();

            System.out.println("첫째 날의 요일을 입력하세요(su, mo, tu, wd, th, fr, st");
            String str_weekday = scanner.next();
            weekday = parseDay(str_weekday);

            if (month > 12 || month < -1) {
                System.out.println("잘못된 입력값입니다.");
                continue;
            }
            cal.prints(year, month, weekday);


        }
        System.out.println("Bye~");
        scanner.close();

    }

    public static void main(String[] args) {
        PROMPT p = new PROMPT();
        p.runPrompt();
    }
}
