import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        System.out.println("|switch");
     switch_1();

     System.out.println("|while---------------");
     while_1();

        System.out.println("|do_while---------------");
     do_while();

        System.out.println("|for---------------");
     for_1();
    }
    public static void switch_1(){
        int month = 4;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch (month){
            case 1:
                season = "겨울";
                break;
            case 2:
                season = "겨울";
                break;
            case 3:
                season = "봄";
                break;
            case 4:
                season = "봄";
                break;
            case 5:
                season = "봄";
                break;
            case 6:
                season = "여름";
                break;
            case 7:
                season = "여름";
                break;
            case 8:
                season = "여름";
                break;
            case 9:
                season = "가을";
                break;
            case 10:
                season = "가을";
                break;
            case 11:
                season = "가을";
                break;
            case 12:
                season = "겨울";
                break;
        }

        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
    public static void while_1(){
        int i = 1;
        while (i<=10){
            System.out.print(i);
            i++;
        }
        System.out.println(" ");
    }
    public static void do_while(){
        int value = 0 ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("입력:");
            value = scanner.nextInt();
            System.out.println("입력받은 값:"+value);
        }while(value!=10); //세미콜론 주의!
            System.out.println("반복문 종료");
    }













    public static void for_1(){
        int N ;
        for (N=5; N>=1; N--){
            System.out.println(N);
        }
    }

}







