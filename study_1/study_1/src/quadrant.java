import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
    quadrant();
        System.out.println("-----------------");
    time();
        System.out.println("-----------------");
    casting();
        System.out.println("-----------------");
    Operation();
        System.out.println("-----------------");
    inch();
        System.out.println("-----------------");
    ranking();
    }
    public static void quadrant(){
        int a = 12;
        int b = 5;
        if (a>=0 && b>=0){ //a와 b가 둘 다 양수라면
            System.out.println("제 1사분면");
        }else if(a<=0 && b>=0){
            System.out.println("제 2사분면"); //a가 음수 b가 양수라면
        }else if(a>=0 && b<=0){ //a가 양수 b가 음수라면
            System.out.println("제 4사분면");
        }else { //a와 b가 둘 다 음수라면
            System.out.println("제 3사분면");
        }
    }
    public static void time(){
        Scanner sc = new Scanner(System.in);
        System.out.print("시:");
        int h = sc.nextInt();
        System.out.print("분:");
        int m = sc.nextInt();

        if (h>0 && h<24){ // 1~23시 24시라는건 없음
            if (m>0 && m<60){ //1~59분 60분이라는건 없음
                String setting_time = (m<45)? (h-1+"시") + (m+15+"분") : (h+"시") + (m-45+"분");
                //[3시 44]분에서 45분을 빼면 [2시 59분] 59+45는 104분 60분 빼면 3시 44분
                //h를 1 빼고 m을 15더함
                //[3시 30분]에서 45분을 빼면 [2시 45분] 45+45는 90분 60분 빼면 3시 30분
                //h를 1 빼고 m을 15분 더함
                System.out.println(setting_time);
             }
        }
        if ( h == 0){
            String set_time = (m<45)? (23+"시") + (m+15+"분") : (h+"시") + (m-45+"분");
            System.out.println(set_time);
            //[0시 44분] 이면 [23시 59분]
        }
    }
    public static void casting(){
        double value = 0.89;
        int integer;
        integer = (int) value;
        System.out.println(integer);
    }
    public static void Operation(){
        int A = 1;
        int B = 6;
        int C = 4;
        int value1 = (A+B)%C;
        int value2=((A%C)+(B%C))%C;
        System.out.println("value1:"+value1);
        System.out.println("value2:"+value2);
        //둘은 같다
        int value3 = (A*B)%C;
        int value4 = ((A%C)*(B%C))%C;
        System.out.println("value3:"+value3);
        System.out.println("value4:"+value4);
        //이 둘도 같다
    }
    public static void inch(){
     double inch = 5;
     double cm = inch*2.54;
     double ml = inch*25.4;
        System.out.println("cm:" + cm);
        System.out.println("ml:" + ml );
        System.out.println("inch:" + cm/2.54);
    }
    public static void ranking(){
        int a, b;
        a = (21 / 4) * 3; //15
        b = (a++ * a) / a; //15
        System.out.println("a:"+a); //16
        System.out.println("b:"+b); //15
    }
}
