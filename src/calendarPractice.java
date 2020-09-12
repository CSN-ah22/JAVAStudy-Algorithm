

public class calendarPractice {
    private static final int[] mmd = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        if ( year % 4 ==0 &&( year % 100 !=0 || year % 400 ==0)) {
            return true;
        } else {
            return false;
        }
    }

    public int maxDays(int year,int month) {
        if (isLeapYear(year)) {
            return  LEAP_MAX_DAYS[month-1];
        }else {
            return mmd[month - 1];
        }
    }

    public void prints(int year,int month) {
        System.out.printf(" <<%4d년 %3d월>>\n", year, month);
        System.out.println(
                        "SU MO TU WE TY FR SA\n");

        int days = maxDays(year, month);

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d",i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
//                        "일	월	화	수	목	금	토\n" +
//                        "30	31	1	2	3	4	5\n" +
//                        "6	7	8	9	10	11	12\n" +
//                        "13	14	15	16	17	18	19\n" +
//                        "20	21	22	23	24	25	26\n" +
//                        "27	28	29	30	 1	 2	 3\n");

    }


}
