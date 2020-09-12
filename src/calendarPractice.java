public class calendarPractice {
    private static final int[] mmd = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    private final int[] LEAP_MAX_DAYS = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int maxDays(int year, int month) {
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month - 1];
        } else {
            return mmd[month - 1];
        }
    }

    public void prints(int year, int month, int weekday) {
        System.out.printf(" <<%4d년 %3d월>>\n", year, month);
        System.out.println(
                "SU MO TU WD TH FR SA");

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


}
