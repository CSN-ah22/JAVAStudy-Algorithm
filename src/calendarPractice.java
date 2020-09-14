import java.util.Calendar;

public class calendarPractice {
    private static final int[] mmd = {0,31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    private final int[] LEAP_MAX_DAYS = {0,31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int maxDays(int year, int month) {
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month];
        } else {
            return mmd[month];
        }
    }

    public void prints(int year, int month) {
        System.out.printf(" <<%4d년 %3d월>>\n", year, month);
        System.out.println(
                "SU MO TU WD TH FR SA");

        //get weekday automaticqally
        int weekday = getweekDay(year, month, 1);                   //밑에 윤년 계산해서 내보내는 함수의 매개변수

        for (int i = 0; i < weekday; i++) {
            System.out.print("   ");
        }
        int days = maxDays(year, month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

       /* ↑요거랑 같음
       if (count < 7) {
            delim =count;
        }else {
            delim = 0;
        }
*/
        //print first line
        for (int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        //print from second line to last
        count++;
        for (int i = count; i <= days; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == delim) {
                System.out.println();
            }


        }
        System.out.println();
        System.out.println();
        System.out.println(" ");
//                        "일	월	화	수	목	금	토\n" +
//                        "30	31	1	2	3	4	5\n" +
//                        "6	7	8	9	10	11	12\n" +
//                        "13	14	15	16	17	18	19\n" +
//                        "20	21	22	23	24	25	26\n" +
//                        "27	28	29	30	 1	 2	 3\n");

    }

    private int getweekDay(int year, int month, int day) {
        int syear = 1970;
        final int STANDARD_WEEKDAY = 3; //1970년 1월 1일 = 목요일/ 0은 월요일 ~

        int count = 0;

        for (int i = syear; i < year; i++) {
            int delta = isLeapYear(i) ? 366 : 365; //윤년이 맞는지 아닌지 체크하기
            count = count + delta;
        }
        for (int i = 1; i < month; i++) {
            int delta = maxDays(year,i); //올해가 윤년이면 : 윤년의 날짜 배열을 리턴해라
            count = count + delta;
        }
            count = count + day; //1월은 계산할 필요가 없다
        int weekday = (count + STANDARD_WEEKDAY)% 7;
        return weekday;
    }
        //테스트
    public static void main(String[] args) {
        calendarPractice c = new calendarPractice();
        System.out.println(c.getweekDay(1970, 1, 1)==3);
        System.out.println(c.getweekDay(1971, 1, 1)==4);
        System.out.println(c.getweekDay(1972, 1, 1)==5);
        System.out.println(c.getweekDay(1973, 1, 1)==0);
        System.out.println(c.getweekDay(1974, 1, 1)==1);


    }


}
